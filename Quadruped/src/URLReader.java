
import org.htmlparser.parserapplications.StringExtractor;
import org.htmlparser.util.ParserException;

/*
 * Reads the text on a url. Helps us know about the aknowledgement from the bot once it 
 */

public class URLReader {

	public static boolean readFromURL(String action) {
		try {
			StringExtractor se = new StringExtractor("http://192.168.0.28/" + action);
			String content = se.extractStrings(false);
			System.out.println(content);
			System.out.println("================================================");
			if(content.equals(action + " started")) {
				return true;
			}
			else {
				return false;
			}
		} catch (ParserException e) {
			e.printStackTrace();
		}
		return false;
	}
}