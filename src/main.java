import java.util.Scanner;

public class main {

    static final int N = 3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        alumno alumno[] = new alumno[N];
        double higher=0,index=0;
        for(int i=0;i<N;i++)
        {
            alumno al = new alumno();
            System.out.print("Ingrese el nombre del alumno" + (i +1)+":");
            al.setName(in.nextLine());
            System.out.print("Ingrese la edad de "+al.getName()+":");
            al.setEdad(Double.valueOf(in.nextLine()));
            if(al.getEdad()>higher)
            {
                higher=al.getEdad();
                index=i;
            }
            alumno[i]=al;

        }
        System.out.print("El alumno con mayor edad es:"+ alumno[(int)index]);
        in.close();

    }
}
