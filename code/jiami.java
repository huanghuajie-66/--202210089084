package 项目版本管理实践;

public class jiami {
	public String add(String cd) {
		byte[] s=cd.getBytes();
		for(int i=0;i<cd.length();i++) {
			s[i]=(byte)(cd.charAt(i)+3+cd.indexOf(cd.charAt(i))+1);
		}
		String st=new String(s);
		return st;
	}
	public String exchange(String a) {
		String str=add(a);
		return (str.substring(str.length() - 1)
                + str.substring(1, str.length() - 1)
                + str.substring(0, 1));
	}
	public String rev(String a) {
		String str1=exchange(a);
		StringBuffer sb=new StringBuffer(str1);
		String result=sb.reverse().toString();
		return result;
	}
}
