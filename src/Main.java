import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Main {
    static DanhSachCauHoiThi mDanhSachCauHoiThi;
    static NodeMonHoc mHeadDanhSachMonHoc;
    public static int hashCode(final String maMH)
    {
        int sum = 0;
        for(int i = 0; i < maMH.length(); i++)
        {
            sum += (i+1)*(maMH.charAt(i) * maMH.charAt(i));
        }
        return sum % 2000;
    }
    public static void themCauHoi(CauHoi cauhoi)
    {
        int id = mDanhSachCauHoiThi.Count + 1;
        int index = hashCode(cauhoi.maMH);

        cauhoi.id = id;

        while (mDanhSachCauHoiThi.Data[index].id != -1)
        {
            index++;
            // not over 2000
            index %= mDanhSachCauHoiThi.MaxSize;
        }

        mDanhSachCauHoiThi.Data[index] = cauhoi;
        mDanhSachCauHoiThi.Count++;
    }
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

                themCauHoi(cauhoi);
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

    // insert MH into doubly link list at tail
    public static NodeMonHoc insertMH(NodeMonHoc head, MonHoc data)
    {
        NodeMonHoc node = new NodeMonHoc(data);
        if(head == null)
        {
            head = node;
            return node;
        }

        // traverse node from head to tail by loop
        // move current node to next side node
        NodeMonHoc root = head;
        while(root.next != null)
        {
            root = root.next;
        }
        // out of while loop, then root.next = null, it is a tail node
        root.next = node; // insert node at tail
        return head;
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
                MonHoc monhoc = new MonHoc();

                // Read next line from file, for TenMH
                sb.append(line);
                monhoc.tenMH = line;

                // Read next line from file, for MaMH
                sb.append(line);
                monhoc.maMH = line;

                // insert MonHoc to link list
                insertMH(mHeadDanhSachMonHoc, monhoc);
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
