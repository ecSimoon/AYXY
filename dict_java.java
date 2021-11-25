import java.util.*;


public class work_1 {
    public static void main(String[] args)
    {
        //  HashMap() 字典类型对象创建及应用  字典 ==   "键" : "值"
        HashMap dict = new HashMap();

        dict.put("姓名","moon");
        dict.put("学号","183454136");
        dict.put("生日","2000-03030");

        System.out.println("姓名: " + dict.get("姓名"));
        System.out.println("学号: " + dict.get("学号"));
        System.out.println("生日: " + dict.get("生日"));
        System.out.println("\n\n");

        // 遍历循环  HashMap 类型   字典遍历输出 键和值
        Set keys = dict.keySet();  //获取键的集合
        Iterator it = keys.iterator();

        while(it.hasNext())
        {
            Object key   = it.next();
            Object value = dict.get(key);
                System.out.println(key + ">>> " + value);

        }

        //HashMap 常见操作方法
        System.out.println("集合长度: " +  dict.size());  //.size
        System.out.println(dict.containsKey("学号"));                                    //.containKey   判断是否存在键   返回True / Flase
        System.out.println(dict.containsValue("183454136"));                           //.containValue 判断是否存在值   返回True / Flase
        System.out.println(dict.containsValue("183454137"));                           //.containValue 判断是否存在值   返回True / Flase
        System.out.println(dict.remove("学号"));
        System.out.println(dict.containsKey("学号"));




    }






}
