import java.util.*;
class one{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		String p=check(st);
        System.out.println(p);
		
	}
    public static String check(String st){
        String ar[]=new String[1000];
		for(int i=0;i<ar.length;i++) {
			ar[i]="";
		}
        String result="";
		int c=0;
		int ct=0;
		int a=0;
		for(int i=0;i<st.length();i++) {
			if(st.charAt(i)=='(') {
				c++;
			}
			else {
				c--;
			}
			if(c==0) {
				ar[ct]=st.substring(a, i+1);
				a=i+1;
				ct++;
			}
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i]=="") {
				break;
			}
			else {
				int l=ar[i].length();
				result=result+ar[i].substring(1, l-1);
			}
		}
        return result;
    }
}
