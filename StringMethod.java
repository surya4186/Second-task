package SecondTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMethod {
    String str = null;
    char c[] = null;
    public StringMethod(String str) {
        this.str=str;
        this.c = str.toCharArray();
    }
    public char charAt(int num) {
    	        if(num < this.str.length()){
    	        	
    	            return c[num];
    	        }
    	        return ' ';
    	    }
    public String concat(String s1) {
        return str+s1;
    }
    
    public String replace(char c1,char c2) {
        LinkedList<Character> list= new LinkedList<>();
        char[] chr=this.str.toCharArray();
        for(char character:chr) {
            list.add(character);
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i)==c1) {
                list.set(i, c2);
            }
        }
        String string="";
        for(int i=0;i<list.size();i++) {
        	string+=list.get(i);
        }
        return string;
    }
    
    public String replaceFirst(char c1,char c2) {
        LinkedList<Character> list= new LinkedList<>();
        char[] chr=str.toCharArray();
        for(char character:chr) {
            list.add(character);
        }
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i)==c1) {
                list.set(i, c2);
                break;
            }
        }
        String string="";
        for(int i=0;i<list.size();i++) {
        	string+=list.get(i);
        }
        
        return string;
    }
    
    public boolean empty() {
        if(this.str=="") {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean equals(String s) {
    	char []ch1=str.toCharArray();
    	char []ch2=s.toCharArray();
    	String st="";
    	for(int i=0;i<str.length();i++){
    		if(ch1[i]==ch2[i]) {
    			st+=ch1[i];
    		}
    		else {
    			return false;
    		}	
    	}
             return true;
     }
    
    public int length(){
//         char [] ch=str.toCharArray();
         return c.length;
     }
    public int codePointAt(int n) {
    	
    	char chr=this.charAt(n);
    	return (int)chr;
    }
    public int codeBointBefore(int n) {
    	char chr = 0;
    	if(n<this.str.length()) {
    		 chr=this.charAt(n-1);
    	}
    	return (int)chr;
    }
    public boolean contain(String s) {
    	char [] ch1=this.str.toCharArray();
    	char[] ch2=s.toCharArray();
    	if(!(ch1.length>=ch2.length)) {
    		return false;
    	}
    	for (int i = 0; i < ch1.length; i++) {
    		if(ch1[i] == ch2[0] && ch1.length - i >= ch2.length) {
    			
    			int mi = i;
    			int counter = 0;
    			
    			for(char chr : ch2) {
    				if(ch1[mi] == chr)  counter++;
    				mi++;
    			}
    			return counter == ch2.length;
    		}
    	}
    	return false;
     }
    
    public char[] tocharArray() {
    	
    	char[] chr=new char[str.length()];
    	for(int i=0;i<this.str.length();i++) {
    		chr[i]=this.charAt(i);
    	}
    	return chr;
    }
    
    
    public char[] toLowerCase() {
    	char [] ch=str.toCharArray();
    	int ab;
    	for(int i=0;i<str.length();i++) {  			
    		 if (ch[i] > 64 && ch[i] < 91) {
    		   ab=(int)ch[i]+32;
    		 ch[i]=(char)ab;
    	}
    	String sr=ch.toString();
    }

    	return ch;
    }
    public char[] toUpperCase() {
    	char [] ch=str.toCharArray();
    	int ab;
    	for(int i=0;i<str.length();i++) {
    		 if (ch[i] > 96 && ch[i] < 122) {
    		   ab=(int)ch[i]-32;
    		 ch[i]=(char)ab;
    	}
    	String sr=ch.toString();
    }
    	return ch;
    }
    public int codeBointCount(int a,int b) {
    	if(str.length() > b) {
    		return b-a;
    	}
    	
    	return -1;
    }

    public boolean contentEqual(String s) {
    	String st=this.str;
    	if(this.str==s) {
    		return true;
    	}
    	return false;
    }
     public boolean startWith(String s) {
    	char [] chr=s.toCharArray();
//    	String st=" ";
    	int num=0;
    	if(c[0]==chr[0]) {
    	 for(int i=0;i<s.length();i++) {
    			if(c[i]==chr[i]) {
    				num++;  				
    			}	
    		} 
    	}
    	else {
    		return false;
    	}
    	if(num==s.length()) {
    		return true;
    	}
    	
    	return false;
    }
     
     public String subString(int num) {
    	 char[] chr=this.str.toCharArray();
    	 char [] subStr=new char[num];
    	 String s1="";
    	 for(int i=num;i<this.str.length();i++) {
    		 s1+=chr[i];
    	 }
    	 return s1;
     }
     public String subString(int x,int y) {
    	 char[] chr=this.str.toCharArray();
    	 char [] subStr=new char[y-x];
    	 String s1="";
    	 for(int i= x;i < y;i++) {
    		
    		 s1+=chr[i];
    	 }
    	 
    	 return s1;
     }
     public int indexOf(String s) {
//    	 ArrayList<Character> arr=new ArrayList<>();
    	 char [] arr=s.toCharArray();
    	 char [] chr=this.str.toCharArray();
    	 int len=this.str.length();
    	 for(int i=0;i<str.length();i++) {
    		 
    		 String substr=this.subString(i, len); 
    		 boolean match=find(substr,s);
    		 if(match) {
    			 return i;
    		 }
    	 }
    	 
    	 return -1;
     }
     public int indexOf(String s,int n) {
    	 char [] arr=s.toCharArray();
    	 char [] chr=this.str.toCharArray();
    	 int len=this.str.length();
    	 for(int i=n;i<str.length();i++) {
    		 
    		 String substr=this.subString(i, len); 
    		 boolean match=find(substr,s);
    		 if(match) {
    			 return i;
    		 }
    	 }
    	 
    	 return -1;
		
     }

     public  boolean find(String s1,String s2) {
    	 char [] ch1=s1.toCharArray();
    	 char [] ch2=s2.toCharArray();
		   int le=s2.length();
		   for(int i=0;i<le;i++) {
			   if(ch2[i]!=ch1[i]) {
				   return false;
			   }
			   
		   }
		 return true;
	 }
     public String trim() {

    	 char [] chr=this.str.toCharArray();
    	 ArrayList<Character> arr=new ArrayList();
    	 for(char character:chr) {
    		 arr.add(character);
    	 }
    	
    	 int count=0;
    	 for(int i=0;i<str.length();i++) {
    		 if(arr.get(i)==(char)32) {
    			 count++;
    			 
    		 }else {
    			 break;
    		 }
    			
    	 }
    	 String st=this.subString(count,str.length());
    	 char[] cha2=st.toCharArray();
    	 int len=st.length();
    	 int n=0;
    	 for(int j=len-1;j>0;j--) {
    		 if(cha2[j]==(char)32) {
    			 n++;
//    			
    		 }else {
    			 break;
    		 }
    	 }
//    	 System.out.println(str.length());
//    	 System.out.println(n);
//    	 System.out.println(count);
    	 String s3=this.str.substring(count,len-n+1);
//    	 System.out.println(s3.length());
    	 return s3;
     }
     
    
     public String split(String s) {
    	 char [] chr=s.toCharArray();
    	 ArrayList<Character> arr=new ArrayList();
    	 char [] word=this.str.toCharArray();
    	 for(char letter:chr) {
    		 arr.add(letter);
    	 }

    	 
    	 Pattern p=Pattern.compile(s);
    	 
    	 Matcher m=p.matcher(this.str);
    	 while(m.find()) {
//    		 System.out.println(m.start());

    		 word[m.start()]=',';
    	 }
    	 String st=new String(word);
//    	 System.out.println(st);
    	 
    	 return st;
     }
     

		
}

	
//
