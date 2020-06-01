import java.awt.Desktop;
import java.net.URI;
import java.util.Random;
import java.util.Scanner;
class stockPicker{
public static void main(String args[]) throws Exception{
Desktop d = Desktop.getDesktop();
Random rand = new Random();
Scanner key = new Scanner(System.in);
System.out.print("Do you have a stock account? Yes/no type here ::");
String outp = key.next();
int ub = 30;
int i = rand.nextInt(ub);
if(((outp.charAt(0)=='N')&&(outp.charAt(1)== 'O'))||((outp.charAt(0)=='n')&&(outp.charAt(1)== 'o'))){
d.browse(new URI("https://join.robinhood.com/zohraa7"));}
if(i == 0){
d.browse(new URI("https://in.finance.yahoo.com/quote/XOM?p=XOM&.tsrc=fin-srch"));
System.out.println("EXXon Mobil");}
else if (i==1){
d.browse(new URI("https://in.finance.yahoo.com/quote/MMM?p=MMM&.tsrc=fin-srch"));
System.out.println("3M");
}
else if (i==2){
d.browse(new URI("https://in.finance.yahoo.com/quote/AXP?p=AXP&.tsrc=fin-srch"));
System.out.println("American Express");
}
else if (i==3){
d.browse(new URI("https://in.finance.yahoo.com/quote/AAPL?p=AAPL&.tsrc=fin-srch"));
System.out.println("Apple");}
else if (i==4){
d.browse(new URI("https://in.finance.yahoo.com/quote/BA?p=BA&.tsrc=fin-srch"));
System.out.println("Boeing");}
else if (i==5){
d.browse(new URI("https://in.finance.yahoo.com/quote/CAT?p=CAT&.tsrc=fin-srch"));
System.out.println("Caterpillar");}
else if (i==6){
d.browse(new URI("https://in.finance.yahoo.com/quote/CVX?p=CVX&.tsrc=fin-srch"));
System.out.println("Chevron");}
else if (i==7){
d.browse(new URI("https://in.finance.yahoo.com/quote/CSCO?p=CSCO&.tsrc=fin-srch"));
System.out.println("Cisco");}
else if (i==8){
d.browse(new URI("https://in.finance.yahoo.com/quote/KO?p=KO&.tsrc=fin-srch"));
System.out.println("Coca-Cola");}
else if (i==9){
d.browse(new URI("https://in.finance.yahoo.com/quote/DIS?p=DIS&.tsrc=fin-srch"));
System.out.println("Walt Disney Company");}
else if (i==10){
d.browse(new URI("https://finance.yahoo.com/quote/DD?p=DD&.tsrc=fin-srch"));
System.out.println("DowDuPont");}
else if (i==11){
d.browse(new URI("https://finance.yahoo.com/quote/GE?p=GE&.tsrc=fin-srch"));
System.out.println("General Electric");}
else if (i==12){
d.browse(new URI("https://finance.yahoo.com/quote/GS?p=GS&.tsrc=fin-srch"));
System.out.println("Goldman Sachs");}
else if (i==13){
d.browse(new URI("https://finance.yahoo.com/quote/HD?p=HD&.tsrc=fin-srch"));
System.out.println("The Home Depot");}
else if (i==14){
d.browse(new URI("https://finance.yahoo.com/quote/IBM?p=IBM&.tsrc=fin-srch"));
System.out.println("IBM");}
else if (i==15){
d.browse(new URI("https://finance.yahoo.com/quote/INTC?p=INTC&.tsrc=fin-srch"));
System.out.println("Intel");}
else if (i==16){
d.browse(new URI("https://finance.yahoo.com/quote/JNJ?p=JNJ&.tsrc=fin-srch"));
System.out.println("Johnson & Johnson");}
else if (i==17){
d.browse(new URI("https://finance.yahoo.com/quote/JPM?p=JPM&.tsrc=fin-srch"));
System.out.println("JPMorgan Chase");}
else if (i==18){
d.browse(new URI("https://finance.yahoo.com/quote/MCD?p=MCD&.tsrc=fin-srch"));
System.out.println("Mcdonald's");}
else if (i==19){
d.browse(new URI("https://finance.yahoo.com/quote/MRK?p=MRK&.tsrc=fin-srch"));
System.out.println("Merck");}
else if (i==20){
d.browse(new URI("https://finance.yahoo.com/quote/MSFT?p=MSFT&.tsrc=fin-srch"));
System.out.println("Microsoft");}
else if (i==21){
d.browse(new URI("https://finance.yahoo.com/quote/NKE?p=NKE&.tsrc=fin-srch"));
System.out.println("Nike");}
else if (i==22){
d.browse(new URI("https://finance.yahoo.com/quote/PFE?p=PFE&.tsrc=fin-srch"));
System.out.println("Pfizer");}
else if (i==23){
d.browse(new URI("https://finance.yahoo.com/quote/PG?p=PG&.tsrc=fin-srch"));
System.out.println("Procter & Gamble");}
else if (i==24){
d.browse(new URI("https://finance.yahoo.com/quote/TRV?p=TRV&.tsrc=fin-srch"));
System.out.println("Travelers Companies");}
else if (i==25){
d.browse(new URI("https://finance.yahoo.com/quote/RTX?p=RTX&.tsrc=fin-srch"));
System.out.println("Raytheon Technologies");}
else if (i==26){
d.browse(new URI("https://finance.yahoo.com/quote/UNH?p=UNH&.tsrc=fin-srch"));
System.out.println("UnitedHealth");}
else if (i==27){
d.browse(new URI("https://finance.yahoo.com/quote/VZ?p=VZ&.tsrc=fin-srch"));
System.out.println("Verizon");}
else if (i==28){
d.browse(new URI("https://finance.yahoo.com/quote/V?p=V&.tsrc=fin-srch"));
System.out.println("Visa");}
else if (i==29){
d.browse(new URI("https://finance.yahoo.com/quote/WMT?p=WMT&.tsrc=fin-srch"));
System.out.println("Wal-Mart");}
}
}
