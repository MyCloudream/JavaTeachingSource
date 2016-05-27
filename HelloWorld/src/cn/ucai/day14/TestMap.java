package cn.ucai.day14;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * key-value:键值对
 */
public class TestMap {
	// 用户管理  增删改查
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		// 添加方法
		String s0 = map.put("username","zhangsan");
//		System.out.println(s0);// null
		map.put("password", "123456");
		map.put("email", "zhangsan@ucai.cn");
		// 删修查
//		System.out.println(map.toString());
//		map.remove("username");
		// 覆盖掉之前的 （修改）
//		String v = map.put("username", "lisi");
//		System.out.println(v);
//		System.out.println(map.toString());
		// 根据key取value
//		String userName = map.get("username");
//		System.out.println(userName);
		// 两种取全部value的方法 
		// 1
		Collection<String> coll = map.values();
		String[] strArr = coll.toArray(new String[]{});
		for(String s : strArr){
			System.out.println(s);
		}
		// 2
		Iterator<String> it = coll.iterator();
		while(it.hasNext()){
			String value = it.next();
			System.out.println("value:"+value);
		}
	}
}
