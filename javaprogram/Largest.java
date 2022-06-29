public class Largest{
public static void main(String[] args){
int a[]={50,30,40,20};
int Max=a[0];
for (int i=1;i<a.length;i++){
if(a[i]>Max)
{
Max=a[i];
}}
System.out.println("maximum element is array is:"+Max);
}
}