package exo2;

public class Calculate {

    public static void main(String[] args){
        Employee [] array = new Employee[10];
        array[0] = new CDI("sqjklsf","sfsf",(float)3540.0);
        array[1] = new CDI("otizety","iyte",(float)1798.0);
        array[2] = new CDI("reyituy","ièèety",(float)12546.0);
        array[3] = new CDI("roehe","yt",(float)1245.0);
        array[4] = new CDD("test","izeute",(float)2365.0,(float)12.0);
        array[5] = new CDD("azr","uty",(float)1154.0,(float)1548.0);
        array[6] = new CDD("oreyiu","oyuo",(float)1578.0,(float)13000.0);
        array[7] = new TP("Tresr","ppoyu",(float)110.0, (float) 13.1);
        array[8] = new TP("erytu","oiryuoyri",(float)78.0,(float) 18.1);
        array[9] = new TP("iuo","trete",(float)178.0,(float) 45);
        float sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += array[i].getSalary();
        }
        System.out.println(sum);
    }
}
