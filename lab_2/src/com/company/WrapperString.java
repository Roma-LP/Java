package com.company;

//import java.util.Objects;

public class WrapperString {
    private String str;
    private  int hash;
    @Override
    public String toString() {
        return "WrapperString{" +
                "str='" + str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return false;
    }

    @Override
    public int hashCode() {
        hash++;
        return 65487%hash;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public WrapperString(String str) {
        this.str = str;
    }

    public void replace (char oldchar, char newchar){
        char[] buf = str.toCharArray();
        for(int i=0;i<buf.length;i++)
        {
            if(buf[i]==oldchar){

                buf[i]=newchar;
            }
        }
        str=new String(buf);
    }

    public void replace() {
        System.out.println("WrapperString.replace()");
    }
}
