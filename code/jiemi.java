package 项目版本管理实践;

public class jiemi {
	jiami c=new jiami();
	public String LastReduce(String b) {
		StringBuffer sb=new StringBuffer(b);
		String result=sb.reverse().toString();
		return result;
	}
	
	public String TheNextRuduce(String b) {
		String str=LastReduce(b);
		return (str.substring(0, 1)
				+str.substring(1, str.length() - 1)
				+str.substring(str.length() - 1));

	}

	public String reduce(String b) {
		String bb=TheNextRuduce(b);
		byte[] st=bb.getBytes();
		for(int i=0;i<bb.length();i++) {
			st[i]=(byte)(bb.charAt(i)-3-bb.indexOf(bb.charAt(i))-1);
		}
		String ss=new String(st);
		return ss;
	}

}
