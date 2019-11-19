
import java.io.*;
import java.util.*;


/**
 *
 * @author Ahmed Mostafa
 */
public class InputFile {

    public Integer minimumSupportThreshold;
		public ArrayList<HashSet<Integer>> bucketList;
		public HashMap<String, Integer> itemMap;
		public HashMap<Integer, String> hashItemMap;
		public InputFile() {
			minimumSupportThreshold = 0;
			bucketList = new ArrayList<HashSet<Integer>>();
			itemMap = new HashMap<String, Integer>();
			hashItemMap = new HashMap<Integer, String>();
		}

}
