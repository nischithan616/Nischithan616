class product
{  
   int p;
   int gst;
   int quality;
}
public void leatherwallet()
{
  int p=1100;
  int gst=18;
  int quality=1;
  m1=gst*p/100;
  return(m1);
}
public void umbrella()
{
  int p=900;
  int gst=12;
  int quality=4;
  m2=gst*p/100;
  return(m2);
}
public void cigrette()
{
  int p=200;
  int gst=28;
  int quality=3;
  m3=gst*p/100;
  return(m3);
}
public void honey()
{
  int p=100;
  int gst=0;
  int quality=2;
  m3=gst*p/100;
  return(m4);  
}
void get calculate()
{
  if(m1>m2) && (m1>m3) && (m1>m4)
  {
    System.out.println("maximum gst of leatherwallet");
   }
  
   else if(m2>m3) && (m2>m4) && (m2>m1)
   {
    System.out.println("maximum gst of umbrella");
   }
   else if(m3>m2) && (m3>m4) && (m3>m1)
   {
    System.out.println("maximum gst of cigarette");
   }
   else if(m4>m2) && (m4>m3) && (m4>m1)
   {
    System.out.println("maximum gst of honey");
   }
}
 void totalammount()
{
  int
