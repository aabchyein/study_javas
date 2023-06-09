import java.util.ArrayList;
import java.util.HashMap;
public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
        try {
            //퀘스트: ArrayList와 HashMap 활용해 입력과 출력하기
            ArrayList<HashMap> Chart = new ArrayList<HashMap>();
            HashMap<String, String> Information = new HashMap<String, String>();
            Information.put("Name","이름");
            Information.put("Gender","성별");
            Information.put("Age","나이");
            Information.put("Height","키(cm)");
            Information.put("Weight","체중(kg)");
            Information.put("BP","혈압(mmHg)");
            Information.put("BS","혈당(mg/dL)");
            Information.put("Result","검진결과");
            Information.put("ReCheck","재검진항목");
            Information.put("MaintenancePlan","유지방안");
            Chart.add(Information);

            Information = new HashMap<String, String>();
            Information.put("Name","홍길동");
            Information.put("Gender","남");
            Information.put("Age","30");
            Information.put("Height","175");
            Information.put("Weight","75");
            Information.put("BP","120/80");
            Information.put("BS","90");
            Information.put("Result","비정상");
            Information.put("ReCheck","폐암,갑상선질환");
            Information.put("MaintenancePlan","");
            Chart.add(Information);

            Information = new HashMap<String, String>();
            Information.put("Name","김영희");
            Information.put("Gender","여");
            Information.put("Age","25");
            Information.put("Height","160");
            Information.put("Weight","55");
            Information.put("BP","110/70");
            Information.put("BS","85");
            Information.put("Result","비정상");
            Information.put("ReCheck","간암,뇌졸중");
            Information.put("MaintenancePlan","");
            Chart.add(Information);

            Information = new HashMap<String, String>();
            Information.put("Name","박철수");
            Information.put("Gender","남");
            Information.put("Age","45");
            Information.put("Height","180");
            Information.put("Weight","85");
            Information.put("BP","130/85");
            Information.put("BS","100");
            Information.put("Result","정상");
            Information.put("ReCheck","심장질환");
            Information.put("MaintenancePlan","식습관개선,운동계획");
            Chart.add(Information);

            Information = new HashMap<String, String>();
            Information.put("Name","이지은");
            Information.put("Gender","여");
            Information.put("Age","35");
            Information.put("Height","165");
            Information.put("Weight","60");
            Information.put("BP","115/75");
            Information.put("BS","95");
            Information.put("Result","비정상");
            Information.put("ReCheck","간암,알츠하이머병");
            Information.put("MaintenancePlan","");
            Chart.add(Information);

            Information = new HashMap<String, String>();
            Information.put("Name","최민호");
            Information.put("Gender","남");
            Information.put("Age","28");
            Information.put("Height","170");
            Information.put("Weight","70");
            Information.put("BP","125/80");
            Information.put("BS","92");
            Information.put("Result","정상");
            Information.put("ReCheck","간암");
            Information.put("MaintenancePlan","");
            Chart.add(Information);

            for (HashMap<String, String> patient:Chart) {
                System.out.println(                
                (patient.get("Name") +
                patient.get("Gender") +
                patient.get("Age") +
                patient.get("Height") +
                patient.get("Weight") +
                patient.get("BP") +
                patient.get("BS") +
                patient.get("Result") +
                patient.get("ReCheck") +
                patient.get("MaintenancePlan"))
                );
    
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
