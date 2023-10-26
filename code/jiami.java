package 项目版本管理实践;

public class jiami {
	public String add(String cd) {
		byte[] s=cd.getBytes();//将字符串转换成字符数组类型
		for(int i=0;i<cd.length();i++) {
			s[i]=(byte)(cd.charAt(i)+3+cd.indexOf(cd.charAt(i))+1);//chatAt获取指定索引的字符
		}
		String st=new String(s);//将数组s转换成字符串类型
		return st;  
	}
	public String exchange(String a) {  //将字符串第一位和最后一位互换
		String str=add(a);
		return (str.substring(str.length() - 1)
                + str.substring(1, str.length() - 1)
                + str.substring(0, 1));
	}
	public String rev(String a) {
		String str1=exchange(a);
		StringBuffer sb=new StringBuffer(str1);
		String result=sb.reverse().toString();//reverse字符串反转
		return result;
	}
}
