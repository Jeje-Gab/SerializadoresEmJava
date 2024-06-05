import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ClasseParaSerializar c = new ClasseParaSerializar();
        c.setIdade(39);
        c.setNome("Gabriel");
        c.setSalario(5000);

//        FileOutputStream fos = new FileOutputStream("serializacao.ser");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(c);
//        oos.close();

        // Carregando
        FileInputStream fis = new FileInputStream("serializacao.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        c = (ClasseParaSerializar) ois.readObject();
        ois.close();
        System.out.println(c.getNome());
    }
}