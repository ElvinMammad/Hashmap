import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //Map<Integer, String> istifadə edərək tələbə qeydiyyatı yaz (açar: tələbə nömrəsi, dəyər: ad).
        //Insert: 4 tələbə əlavə et: 101=Ali, 102=Vali, 103=Aysel, 104=Nigar.
        //Insert (təkrar açar): 102 nömrəsi ilə "Elvin" əlavə et. Nə baş verdi? put nə qaytardı?
        //Lookup: 103 nömrəli tələbənin adını çap et. Sonra 999 nömrəlini axtar və "Tapılmadı" çap et (getOrDefault ilə).
        //Lookup: 105 nömrəli tələbə varmı? (containsKey).
        //Remove: 101-i sil. Silinən adı çap et.
        //Remove (olmayan açar): 500-ü silməyə çalış. Nə qaytarır?
        //Sonda map-in ölçüsünü və bütün tərkibini çap et.

        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Ali");
        map.put(102,"Vali");
        map.put(103,"Aysel");
        map.put(104,"Nigar");
        map.put(102,"Elvin");
//        System.out.println(map.get(102));
//        System.out.println(map.get(103));
//        System.out.println(map.getOrDefault(999,"taplmadı"));
//        System.out.println(map.containsKey(105));
//        map.remove(101);
//        System.out.println(map.get(101));
        System.out.println(map.remove(500));
        System.out.println(map.size());
        System.out.println(map);


    }
}