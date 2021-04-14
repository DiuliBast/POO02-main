import java.io.*;
import java.util.ArrayList;

public class ArrayMidias implements IMídia, Serializable {

    public static ArrayList<ArrayMidias> listMidias = new ArrayList<>();


    @Override
    public boolean addMidia(Mídia m) {

        if (m == null) {
            return false;
        }
        if (listMidias.add(m))
            return true;
        else
            return false;
    }

    @Override
    public Mídia getMídia(String titulo) {
        return null;
    }

    @Override
    public boolean editarMídia(String titulo, Mídia mídiaNova) {
        return false;
    }

    @Override
    public boolean removeMídia(String titulo) {
        return false;
    }


    /*
            Mídia

            for (ArrayMidias m : listMidias) {

                return (Mídia) m;

            }
            return null;
        }
    */
    /*
        @Override
        public void  editarMídia (String titulo, Mídia mídiaNova) {
            for (ArrayMidias m : listMidias) {
                if (titulo ==m.getTítulo)){
    String index= listMidias.indexOf(m);
    listMidias.set(index, mídiaNova);
                }


            }
        }
        */
/*
        @Override
        public boolean removeMídia (String titulo) {
    //or(Mídia m : midiaList)


            //if (titulo == m.getTitulo()) {

                return true;

            } else

                return false;
            }

*/
        @Override
        public Mídia getMusicaFilme (String genero){

            return null;
        }

        public String toString () {
            String novo = "";
            for (ArrayMidias m : listMidias) {
                novo = novo + m.toString() + "\n";

            }
            return novo;
        }

        public void grava () throws Exception {

            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("midias.bin"));
            file.writeObject(listMidias);
            file.close();

        }

        public void ler () throws Exception {

            ObjectInputStream file = new ObjectInputStream(new FileInputStream("midias.bin"));

            listMidias = (ArrayList<ArrayMidias>) file.readObject();
            file.close();

        }

        public String exibir () {

            System.out.println(listMidias.toString());
            return null;
        }
    }

