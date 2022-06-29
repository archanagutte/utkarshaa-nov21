public class Constructor{
public static void main(String args[]) {
}
const(){
System.out.println("default const");
}
const(String s,int i) {
System.out.println(s+i);
}
}

public class Const extends Constructor{
Const(){
System.out.println("Const");
}
public static void main(String[] args) {
Constructor.c=new Constructor();
Constructor c2=new Constructor("test",15);
}}