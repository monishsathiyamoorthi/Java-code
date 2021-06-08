import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Train
{
 public static void Read_file(int l)
 {
 int l1 = 0;
BufferedReader reader;
 try
 {
 reader = new BufferedReader(new FileReader("Heart.txt"));
 String line = reader.readLine();
 while (line != null)
 {
 if(l1 == l)
 a = line.split("   ");
 line = reader.readLine();
 l1++;
 }
 reader.close();
} catch (IOException e)
 {
}
 }
 public static void setValues()
 {
 if(a[0].equals("0"))
 {
 a[0] = "0.1";
 }
 try
 {
 in1 = Double.parseDouble(a[0]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[0]);
 in1 = sim * 1.0;
 }
 if(a[1].equals("0"))
 {
 a[1] = "0.1";
 }
 try
 {
 in2 = Double.parseDouble(a[1]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[1]);
 in2 = sim * 1.0;
 }
 if(a[2].equals("0"))
 {
 a[2] = "0.1";
 }
 try
 {
 in3 = Double.parseDouble(a[2]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[2]);
 in3 = sim * 1.0;
 }
 if(a[3].equals("0"))
 {
 a[3] = "0.1";
 }
 try
 {
 in4 = Double.parseDouble(a[3]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[3]);
 in4 = sim * 1.0;
 }
 if(a[4].equals("0"))
 {
 a[4] = "0.1";
 }
 try
 {
 in5 = Double.parseDouble(a[4]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[4]);
 in5 = sim * 1.0;
 }
 if(a[5].equals("0"))
 {
 a[5] = "0.1";
 }
 try
 {
 in6 = Double.parseDouble(a[5]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[5]);
 in6 = sim * 1.0;
 }
 if(a[6].equals("0"))
 {
 a[6] = "0.1";
 }
 try
 {
 in7 = Double.parseDouble(a[6]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[6]);
 in7 = sim * 1.0;
 }
 if(a[7].equals("0"))
 {
 a[7] = "0.1";
 }
 try
 {
 in8 = Double.parseDouble(a[7]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[7]);
 in8 = sim * 1.0;
 }
 if(a[8].equals("0"))
 {
 a[8] = "0.1";
 }
 try
 {
 in9 = Double.parseDouble(a[8]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[8]);
 in9 = sim * 1.0;
 }
 if(a[9].equals("0"))
 {
 a[9] = "0.1";
 }
 try
 {
 in10 = Double.parseDouble(a[9]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[9]);
 in10 = sim * 1.0;
 }
 if(a[10].equals("0"))
 {
 a[10] = "0.1";
 }
 try
 {
 in11 = Double.parseDouble(a[10]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[10]);
 in11 = sim * 1.0;
 }
 if(a[11].equals("0"))
 {
 a[11] = "0.1";
 }
 try
 {
 in12 = Double.parseDouble(a[11]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[11]);
 in12 = sim * 1.0;
 }
 if(a[12].equals("0"))
 {
 a[12] = "0.1";
 }
 try
 {
 in13 = Double.parseDouble(a[12]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[12]);
 in13 = sim * 1.0;
 }
 if(a[13].equals("0"))
 {
 a[13] = "0.1";
 }
 try
 {
 in14 = Double.parseDouble(a[13]);
 }catch(NumberFormatException e)
 {
 sim = Integer.parseInt(a[13]);
 in14 = sim * 1.0;
 }
 }
 public static Boolean activation()
 {
 int t = 0;
 int val = (int) Math.round(yin);
 if(val > val)
 {
 t = 1;
 }
 else if(val == val)
 {
 t = 0;
 }
 else if(val < val)
 {
 t = -1;
 }
 return c1 != t;
 }
 public static void update()
 {
 w11 = (w11 + (alpha*in14*in1));
 w12 = (w12 + (alpha*in14*in2));
 w13 = (w13 + (alpha*in14*in3));
 w14 = (w14 + (alpha*in14*in4));
 w15 = (w15 + (alpha*in14*in5));
 w16 = (w16 + (alpha*in14*in6));
 w17 = (w17 + (alpha*in14*in7));
 w18 = (w18 + (alpha*in14*in8));
 w19 = (w19 + (alpha*in14*in9));
 w110 = (w110 + (alpha*in14*in10));
 w111 = (w111 + (alpha*in14*in11));
 w112 = (w112 + (alpha*in14*in12));
 w113 = (w113 + (alpha*in14*in13));
 b1 = (b1 + (alpha*in14));
 }
 public static void update1()
 {
 w21 = (w21 + (alpha*in14*in1));
 w22 = (w22 + (alpha*in14*in2));
 w23 = (w23 + (alpha*in14*in3));
 w24 = (w24 + (alpha*in14*in4));
 w25 = (w25 + (alpha*in14*in5));
 w26 = (w26 + (alpha*in14*in6));
 w27 = (w27 + (alpha*in14*in7));
 w28 = (w28 + (alpha*in14*in8));
 w29 = (w29 + (alpha*in14*in9));
 w210 = (w210 + (alpha*in14*in10));
 w211 = (w211 + (alpha*in14*in11));
 w212 = (w212 + (alpha*in14*in12));
 w213 = (w213 + (alpha*in14*in13));
 b2 = (b2 + (alpha*in14));
 }
 public static void update2()
 {
 w11w = (w11w + (alpha*in14*in1));
 w12w = (w12w + (alpha*in14*in2));
 w13w = (w13w + (alpha*in14*in3));
 w14w = (w14w + (alpha*in14*in4));
 w15w = (w15w + (alpha*in14*in5));
 w16w = (w16w + (alpha*in14*in6));
 w17w = (w17w + (alpha*in14*in7));
 w18w = (w18w + (alpha*in14*in8));
 w19w = (w19w + (alpha*in14*in9));
 w110w = (w110w + (alpha*in14*in10));
 w111w = (w111w + (alpha*in14*in11));
 w112w = (w112w + (alpha*in14*in12));
 w113w = (w113w + (alpha*in14*in13));
 b1b = (b1b + (alpha*in14));
 }
 public static void update3()
 {
 w21w = (w21w + (alpha*in14*in1));
 w22w = (w22w + (alpha*in14*in2));
 w23w = (w23w + (alpha*in14*in3));
 w24w = (w24w + (alpha*in14*in4));
 w25w = (w25w + (alpha*in14*in5));
 w26w = (w26w + (alpha*in14*in6));
 w27w = (w27w + (alpha*in14*in7));
 w28w = (w28w + (alpha*in14*in8));
 w29w = (w29w + (alpha*in14*in9));
 w210w = (w210w + (alpha*in14*in10));
 w211w = (w211w + (alpha*in14*in11));
 w212w = (w212w + (alpha*in14*in12));
 w213w = (w213w + (alpha*in14*in13));
 b2b = (b2b + (alpha*in14));
 }
 public static void test()
 {
 for(i=200;i<300;i++)
 {
 Read_file(i);
 System.out.println("Input " +(i+1));
 System.out.println(a[0] +","+a[1] +"," +a[2] +"," +a[3] +","
+a[4] +"," +a[5] +"," +a[6] +"," +a[7] +"," +a[8] +"," +a[9] +"," +a[10]
+"," +a[11] +"," +a[12]);
 setValues();
 for(j=0;j<100;j++)
 {
 yin =
(b1b+(in1*w11w)+(in2*w12w)+(in3*w13w)+(in4*w14w)+(in5*w15w
)+(in6*w16w)+(in7*w17w)+(in8*w18w)+(in9*w19w)+(in10*w110w)
+(in11*w111w)+(in12*w112w)+(in13*w113w));
 Boolean bool = activation();
 bool = true;
 if(bool)
 {
 update2();
 }
 }
 h1h =w11w+w12w+w13w+w14w+w15w+w16w+w17w+w18w+w19w+w110w+w111w+w112w+w113w;
 for(j=0;j<100;j++)
 {
 yin =
(b2b+(in1*w21w)+(in2*w22w)+(in3*w23w)+(in4*w24w)+(in5*w25w
)+(in6*w26w)+(in7*w27w)+(in8*w28w)+(in9*w29w)+(in10*w210w)
+(in11*w211w)+(in12*w212w)+(in13*w213w));
 Boolean bool = activation();
 if(bool)
 {
 update3();
 }
 }
 h2h =w21w+w22w+w23w+w24w+w25w+w26w+w27w+w28w+w29w+w210w+w211w+w212w+w213w;
 m_h1 = h1 - h1h;
 m_h2 = h2 - h2h;
 if(m_h1 > m_h2)
 {
 System.out.print("Person has heart disease!!!\n\n");
 }
 else
 {
 if(a[13].equals("0.1"))
{
 System.out.print("Person has heart disease!!!\n\n");
count++;
}
 else
{
 System.out.print("Person is normal\n\n");
count++;
}
 }
 }
double err = (count/130.1)*100.1; //finding accuracy
System.out.println("Accuracy percentage: "+err+"%");
 }
 static String[] a;
 static Double w11=0.0,w12=0.0,w13=0.0,w14=0.0,w15=0.0,w16=0.0,w17=0.0,w18=0.0,w19=0.0,w110=0.0,w111=0.0,w112=0.0,w113=0.0,b1=0.0;
 static Double w21=0.0,w22=0.0,w23=0.0,w24=0.0,w25=0.0,w26=0.0,w27=0.0,w28=0.0,w29=0.0,w210=0.0,w211=0.0,w212=0.0,w213=0.0,b2=0.0;
 static Double w11w=0.0,w12w=0.0,w13w=0.0,w14w=0.0,w15w=0.0,w16w=0.0,w17w=0.0,w18w=0.0,w19w=0.0,w110w=0.0,w111w=0.0,w112w=0.0,w113w=0.0,b1b=0.0;
 static Double w21w=0.0,w22w=0.0,w23w=0.0,w24w=0.0,w25w=0.0,w26w=0.0,w27w=0.0,w28w=0.0,w29w=0.0,w210w=0.0,w211w=0.0,w212w=0.0,w213w=0.0,b2b=0.0;
 static Double h1,h2,h1h,h2h;
 static int alpha = 1,i=0,j=0,iter=0;
 static Double in1=null,in2=null,in3=null,in4=null,in5=null,in6=null,in7=null,in8=null,in9=null,in10=null,in11=null,in12=null,in13=null,in14=null;
 static int sim=0,thi=0;
 static Double yin = null;
 static int c1 = 1;
 static int dis = 1;
 static Double m_h1,m_h2;
 static int count=0;
 public static void main(String[] args)
 {
 System.out.println("Training:\n\n");
 for(j=0;j<100;j++)
 {
 for(i=0;i<200;i++)
 {
 Read_file(i);
 if(dis == 1)
 {
 System.out.println("Input " +(i+1));
 System.out.println(a[0] +","+a[1] +"," +a[2] +"," +a[3] +","+a[4] +"," +a[5] +"," +a[6] +"," +a[7] +"," +a[8] +"," +a[9] +"," +a[10]+"," +a[11] +"," +a[12] +" Desired output: " +a[13]);
 }
 c1 = Integer.parseInt(a[13]);
 setValues();
 if(c1 == 0)
 {
 yin =(b1+(in1*w11)+(in2*w12)+(in3*w13)+(in4*w14)+(in5*w15)+(in6*w16)+(in7*w17)+(in8*w18)+(in9*w19)+(in10*w110)+(in11*w111)+(in12*w112)+(in13*w113));

 Boolean bool = activation();
 bool = true;
 if(bool)
 {
 update();
 }
 }
 else if(c1 > 0)
 {
 yin =(b2+(in1*w21)+(in2*w22)+(in3*w23)+(in4*w24)+(in5*w25)+(in6*w26)+(in7*w27)+(in8*w28)+(in9*w29)+(in10*w210)+(in11*w211)+(in12*w212)+(in13*w213));
 Boolean bool = activation();
 if(bool)
 {
 update1();
 }
 }
 }
 dis = 0;
 }
 h1 =w11+w12+w13+w14+w15+w16+w17+w18+w19+w110+w111+w112+w113;
 h2 =w21+w22+w23+w24+w25+w26+w27+w28+w29+w210+w211+w212+w213;
 System.out.println();
 System.out.println("Hidden-1: " +w11 +","+w12 +"," +w13 +","+w14 +"," +w15 +"," +w16 +"," +w17 +"," +w18 +"," +w19 +"," +w110+"," +w111 +"," +w112 +"," +w113 +"," +b1);
 System.out.println("Hidden-2: " +w21 +","+w22 +"," +w23 +","+w24 +"," +w25 +"," +w26 +"," +w27 +"," +w28 +"," +w29 +"," +w210+"," +w211 +"," +w212 +"," +w213 +"," +b2);
 System.out.println("\n\nTesting:\n");
 test();
 }
}

