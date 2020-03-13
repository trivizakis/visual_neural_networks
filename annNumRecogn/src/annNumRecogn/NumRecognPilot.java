package annNumRecogn;

import org.encog.Encog;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataSet;
import org.encog.ml.data.basic.BasicMLData;
import org.encog.ml.data.basic.BasicMLDataSet;
import org.encog.ml.train.MLTrain;
import org.encog.neural.networks.BasicNetwork;
import org.encog.neural.networks.training.simple.TrainAdaline;
import org.encog.neural.pattern.ADALINEPattern;

public class NumRecognPilot {
	public final static int CHAR_WIDTH = 5;
	public final static int CHAR_HEIGHT = 7;
	private static AnnGui annGui = new AnnGui();
	private static BasicNetwork network;
	
	public static String[][] idealTarget = { 
      { " OOO ",
        "O   O",
        "O   O",
        "O   O",
        "O   O",
        "O   O",
        " OOO "  },

      { "  O  ",
        " OO  ",
        "O O  ",
        "  O  ",
        "  O  ",
        "  O  ",
        "  O  "  },

      { " OOO ",
        "O   O",
        "    O",
        "   O ",
        "  O  ",
        " O   ",
        "OOOOO"  },

      { " OOO ",
        "O   O",
        "    O",
        " OOO ",
        "    O",
        "O   O",
        " OOO "  },

      { "   O ",
        "  OO ",
        " O O ",
        "O  O ",
        "OOOOO",
        "   O ",
        "   O "  },

      { "OOOOO",
        "O    ",
        "O    ",
        "OOOO ",
        "    O",
        "O   O",
        " OOO "  },

      { " OOO ",
        "O   O",
        "O    ",
        "OOOO ",
        "O   O",
        "O   O",
        " OOO "  },

      { "OOOOO",
        "    O",
        "    O",
        "   O ",
        "  O  ",
        " O   ",
        "O    "  },

      { " OOO ",
        "O   O",
        "O   O",
        " OOO ",
        "O   O",
        "O   O",
        " OOO "  },

      { " OOO ",
        "O   O",
        "O   O",
        " OOOO",
        "    O",
        "O   O",
        " OOO "  } };
	
	public static MLDataSet generateTraining(){
		MLDataSet result = new BasicMLDataSet();
		for(int i=0;i<idealTarget.length;i++){			
			BasicMLData ideal = new BasicMLData(idealTarget.length);
			
			//setup input
			MLData input = realTrainingData(idealTarget[i]);
			
			//setup ideal
			for(int j=0;j<idealTarget.length;j++)
			{
				if( j==i )
					ideal.setData(j,1);
				else
					ideal.setData(j,-1);
			}
			result.add(input,ideal);
		}
		return result;
	}
	
	public static MLData realTrainingData(String[] target){
		MLData result = new BasicMLData(CHAR_WIDTH*CHAR_HEIGHT);
		
		for(int row = 0; row<CHAR_HEIGHT; row++)
		{
			for(int col = 0; col<CHAR_WIDTH; col++)
			{
				int index = (row*CHAR_WIDTH) + col;
				char ch = target[row].charAt(col);
				result.setData(index,ch=='O'?1:-1 );
			}
		}
		
		return result;
	}

	public static void main(String args[]){
		int inputNeurons = CHAR_WIDTH * CHAR_HEIGHT;
		int outputNeurons = idealTarget.length;
		
		ADALINEPattern pattern = new ADALINEPattern();
		pattern.setInputNeurons(inputNeurons);
		pattern.setOutputNeurons(outputNeurons);
		network = (BasicNetwork)pattern.generate();
		
		//training
		trainAnn();
		
		Encog.getInstance().shutdown();
	}
	

	public static void testInput(String[] inputToRecogn){
		int output = network.winner(realTrainingData(inputToRecogn));
		for(int i=0; i<inputToRecogn.length; i++){
			annGui.setTextArea(annGui.getTextArea()+
					inputToRecogn[i].replaceAll(" ", "   ").replaceAll("O", "1")+"\n");
		}
		annGui.setTextArea(annGui.getTextArea()+
				"probably is number "+ output +"\n");
	}
	
	private static void trainAnn(){
		double learningRate = 0.01;
		MLDataSet training = generateTraining();
		MLTrain train = new TrainAdaline(network,training,learningRate);
		double error;
		int epoch = 1;
		do {
			train.iteration();
			error = train.getError();
			annGui.setTaOutput(annGui.getTaOutput()+
					"Epoch #"+epoch+" Error: "+error+"\n");
			epoch++;
		} while(train.getError() > learningRate);

		annGui.setTaOutput(annGui.getTaOutput()+
				"Final error value for our ann: " + error);
	}
}
