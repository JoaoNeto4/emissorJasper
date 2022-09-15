

package classe;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;


public class TesteBDFormat {
    
    public static String procuraReal(String s){
        String temp="", temp2="", temp3="";
       
        for(int i=0; i<s.length(); i++){
          temp=s.replaceAll("R", "");
          
       }
       for(int i=0; i<temp.length(); i++){
          temp2=temp.replace("$", "");
          
       }
       for(int i=0; i<temp2.length(); i++){
          temp3=temp2.replaceAll(" ", "");
          
       }
        return temp3;
    }

    
    public static String procuraReal2(String s){
        String temp="", temp2="", temp3="", temp4="";
       
        temp=s.replaceAll("R", "");
        temp2=temp.replace("$", "");
        temp3=temp2.replace(" ", "");
        temp4=temp3.replace(".", "");
        temp=temp4.replace(",", ".");
        
        return temp;
    }
    
    
    public static void main(String[] args) throws java.text.ParseException {
        String str = "R$ 1.564.425,45";
        String out;
        BigDecimal dec;
        
        out=procuraReal2(str);
        
        System.out.println(out);
        
        
        double var = Double.parseDouble(out);
        
        System.out.println(var);
        BigDecimal b = new BigDecimal(var);
        System.out.println(b);
        
        /*
        String str = "R$ 1564.45";
        String out;
        BigDecimal dec;

        DecimalFormat df = new DecimalFormat ("#,##0.00", new DecimalFormatSymbols (Locale.US));
        out=procuraReal2(str);
        BigDecimal b = new BigDecimal(out);
        System.out.println(df.format(b));
        
        
      //  NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
       // BigDecimal b = new BigDecimal(String.valueOf( nf.parse(procuraReal(str))));
        */
        
       
        
        
        /*
        String str = "R$ 1.564,45";
        String out;
        out=procuraReal(str);
        System.out.println(out);
        */
        
        /*
        String s1 = "R$ 1.234.567,89";
        String s2 = "1.234.567,89";
        String s3 = "1234567.89";
        BigDecimal bd;
        DecimalFormat df1 = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormat df2 = (DecimalFormat) DecimalFormat.getNumberInstance();
        df1.setParseBigDecimal (true);
        df2.setParseBigDecimal (true);
        bd = (BigDecimal) df1.parse (s1);
        System.out.println (bd);
        bd = (BigDecimal) df2.parse (s2);
        System.out.println (bd);
        bd = new BigDecimal (s3);
        System.out.println (bd);
        */

    }

    
}
