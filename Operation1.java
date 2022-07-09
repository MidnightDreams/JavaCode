package code1;


public class Operation1 {
/**
 *亦或运算（有一种数出现奇数次，求该数） 
 * @author breeze
 */      
      int findUneven(int [] arr) {
           int er = 0;
           for(int e : arr) {
                 er ^= e;           //er为所求
           } 
           return er;
      }
      
  /**
 *亦或运算（有两种不同的数出现奇数次，求这两种数） 
 * @author breeze
 */    
      void findUneven(int[] arr, int num) {
            if(num == 2) {
                  int er1 = 0;
                  for(int e : arr) {
                        er1  ^= e;       //得到a^b，又a != b,故er != 0
                  }
                  int only = er1 & (~er1+1);//找出相异位
                  int er2 = 0;
                   for(int e : arr) {
                        if((only & e) == 0) {
                              er2 ^= e; 
                        }
                  }
                   System.out.println("两数为："+er2+"\t"+(er2^er1));
            }else {
                  System.out.println("Error,本方法暂时仅支持求两种数");
            }
      }
      
}
