package ��ָoffer;

/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy
 *
 */
public class �滻�ո�  {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("We Are Happy");
		String str = replaceSpace(sb);
		System.out.println(str);
	}
	
	public static String replaceSpace(StringBuffer str) {
		if(str == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append("%20");
			}
			else {
				sb.append(str.charAt(i));
			}
		}	
		return sb.toString();
		
	}
}
