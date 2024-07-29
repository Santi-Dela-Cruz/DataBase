import DataAcessComponent.SexoDAO;
import DataAcessComponent.DTO.SexoDTO;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            SexoDAO sDao = new SexoDAO();
            for(SexoDTO s : sDao.readAll()){
                System.out.println(s.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
