import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Main {
    public static void layCauHoiTuFile() throws IOException
    {
        // Open file CauHoi.txt
        BufferedReader br = new BufferedReader(new FileReader("CauHoi.txt"));
        try
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            // maximum record of CauHoi
            sb.append(line);
            int max = Integer.parseInt(line);

            for(int i = 0; i < max; i++)
            {
                CauHoi cauhoi = new CauHoi();

                // Read next line from file, for Id
                sb.append(line);
                cauhoi.id = Integer.parseInt(line);

                // Read next line from file, for MaMH
                sb.append(line);
                cauhoi.maMH = line;

                // Read next line from file, for NoiDung
                sb.append(line);
                cauhoi.noiDung = line;

                // Read next line from file, for option A
                sb.append(line);
                cauhoi.A = line;

                // Read next line from file, for option B
                sb.append(line);
                cauhoi.B = line;

                // Read next line from file, for option C
                sb.append(line);
                cauhoi.C = line;

                // Read next line from file, for option D
                sb.append(line);
                cauhoi.D = line;

                // Read next line from file, for DapAn
                sb.append(line);
                cauhoi.DA = line;
            }
        }
        catch(IOException e)
        {

        }

        finally
        {
            br.close();
        }

    }

    public static void layMonHocTuFile() throws IOException
    {
     // Open file MonHoc.txt
        BufferedReader br = new BufferedReader(new FileReader("MonHoc.txt"));
        try
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            // maximum record of MonHoc
            sb.append(line);
            int max =  Integer.parseInt(line);

            for (int i = 0; i < max; i++)
            {
                //MonHoc monhoc = new MonHoc();

                // Read next line from file, for MaMH
                sb.append(line);
                //monhoc.maMH = line;

                // Read next line from file, for TenMH
                sb.append(line);
                // monhoc.tenMH = line;
            }
        }
        catch(IOException e)
        {

        }

        finally
        {
            br.close();
        }
    }

    public static void layDanhSachLopTuFile() throws IOException
    {
        // Open file Lop.txt
        BufferedReader br = new BufferedReader(new FileReader("Lop.txt"));
    }

    public static void loadDuLieu() throws IOException
    {
        layCauHoiTuFile();

        layMonHocTuFile();

        layDanhSachLopTuFile();

    }


    public static void dangNhap()
    {

    }

    public static void ketThucChuongTrinh()
    {

    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        loadDuLieu();
        dangNhap();
        ketThucChuongTrinh();
    }

}
