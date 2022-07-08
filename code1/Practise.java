package code1;

public class Practise {
      
//      public static void main(String[] args) {
//            
//      }
      
      
//      /**
//       *数组扩容及数组缩减 
//       */
//      public static void main(String[] args) {
//            
//            int arr[] = {1,2,3};
//            System.out.println("Tip:1(扩容) 2(缩减) 0(退出)");
//            System.out.println("原数组情况：");
//            for(int e: arr) {
//                  System.out.print(e+"\t");
//            }
//            Scanner sc = new Scanner(System.in);
//            label:
//                  while(true) {
//                      System.out.print("\nPlease Enter:"); 
//                      int chocie = sc.nextInt();
//                      switch(chocie){
//                      case 1:
//                           int[] arr1 = new int [arr.length+1];
//                           for(int i = 0; i < arr.length; i++) {
//                                 arr1[i] = arr[i]; 
//                           }
//                           arr1[arr.length] = arr[arr.length-1] + 1;
//                           arr = arr1; //扩容关键（arr指向arr1的地址）
//                           System.out.println("====扩容后====");
//                           for(int e: arr) {
//                                 System.out.print(e+"\t");
//                           }
//                           break;
//                      case 2: 
//                           int[] arr2 = new int [arr.length - 1];
//                           for(int i = 0; i < arr.length - 1; i++) {
//                                 arr2[i] = arr[i]; 
//                           }
//                           arr = arr2; //扩容关键（arr指向arr1的地址）
//                           System.out.println("====缩减后====");
//                           for(int e: arr) {
//                                 System.out.print(e+"\t");
//                           }
//                           break;
//                      case 0:
//                            System.out.println("已退出！");
//                            break label;
//                      default :
//                            System.out.println("Error,请输入1/2/0");
//                      }
//                }
//            sc.close();
//      }
          
///**
// * 对一个有序数组使插入某值后依旧有序      
// * @param args
// */
//      public static void main(String[] args) {
//            int[] arr = {1,2,3,4,5};//有序数组
//            int index = -1;
//            System.out.println("Tip: Enter 0 to end this program");
//            Scanner sc = new Scanner(System.in);
//            while(true) {
//                  System.out.print("What number do you wanna addition:");
//                  String str = sc.next();                       // 为实现退出功能，该处用String接收键盘数据
//                  if( str.compareTo("*") == 0 )break;   //*号退出
//                  int num = Integer.parseInt(str);          //String型转成int型
//                  for(int i = 0; i < arr.length; i++) {//找到对应的下标
//                        if( num<= arr[i]) {
//                              index= i;
//                              break;
//                        }
//                  }
//                  //扩容(java有机制判断数组是否无用，无用时会自动回收)
//                  int temp[] = new int[arr.length+1];
//                  if(index < 0) { //说明该数是数组里最大的
//                        for(int i=0; i < arr.length; i++) {
//                              temp[i] = arr[i];     //前面相同  
//                        }
//                        temp[arr.length] = num;   //故而插入的数放最后面
//                  }else {
//                        for(int i = 0; i < arr.length; i++) {
//                              temp[i] = arr[i];
//                              if(i == index) {
//                                    temp[i] = num;
//                                    for(  ; i < arr.length; i++) {
//                                          temp[i+1]=arr[i];
//                                    }
//                                    break;
//                              }
//                        }
//                  } 
//                  
//                  arr = temp;                 //数据内容转回原来数组（Java小数组接受大数组数据会自动增加容量）
//                
//                  System.out.println("Result:");
//                  for(int i : arr) {//查看结果
//                        System.out.print(i+"\t");
//                  }
//                  System.out.println();
//                  index = -1;                  //下标复位
//            }   
//            sc.close();
//      }
      
//      public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Tip:enter 0 to end the program");
//           while(true) {
//                 System.out.print("How many months:");
//                 int num = sc.nextInt();
//                 if(num == 0) {
//                       System.out.println("End success.");
//                       break;//退出
//                 }else if(num < 0) {
//                       System.out.println("Error!The number what you entered is a negative number.");
//                 }else
//                       System.out.println( fun(num) );
//           }
//           sc.close();
//            
//      }
//      protected static int fun( int num ) {
//            if(num == 1 || num == 2)
//                  return 1;
//            else 
//                  return fun(num-1)+fun(num-2);
//      }
      
//      /**
//       *  随机大小(3-20行)隔空金字塔
//       */
//      public static void main(String[] args) {
//            int row = (int)(Math.random()*20);
//            for(int i = 1; i <= row; i++) {
//                  for(int j = 1; j <= row-i; j++) {
//                        System.out.print(" ");
//                  }
//                  for(int k = 1; k <= 2*i - 1; k++) {
//                        if(k % 2 == 1  || i == row)//空一格输出星号 
//                              System.out.print("*");
//                        else
//                              System.out.print(" ");
//                  }
//                  System.out.println();
//            }
//            System.out.println("行数为:"+row);
//            System.out.println("列数为"+(2*row+1));
//      }
      
//      /**
//       * 随机大小(3-20行)空心金字塔
//       */
//      public static void main(String[] args) {
//            
////            int row =  (int)(Math.random()*20);//注意强制类型转换的对象
//            Random r = new Random();
//            int row = r.nextInt(20);
//            for(int i = 1; i <= row; i++) {
//                  
//                  for(int j = 1; j <= row - i; j++) {//打印空格
//                        System.out.print(" ");
//                  }
//                  
//                  for(int k = 1; k <= 2*i - 1; k++) {
//                        if(k == 1 || k ==  2*i -1  || i == row) {//实现打印前、后及最后一行星号
//                              System.out.print("*");
//                        }else {
//                              System.out.print(" ");//打印空心
//                        }
//                              
//                  }
//                  System.out.println();
//            }
//            System.out.println("行数为:"+row+"\n列数为:"+(2*row-1));
//      }
      
//      /**
//       * 反斜杠
//       * @param args
//       */
//      public static void main(String[] args) {
//            char c1  = '\n';
//            char c2  = '\r';
//            char c3  = '\b';
//            char c4  = '\t';
//            System.out.println(c1+" "+c2+" "+c3+" "+c4+" ");
//      }
		
///**
// * 类型转换
// * @author breeze
// *相应包装类.parse相应包装类(对象)
// */	
//	public static void main(String[] args) {
//		String str = new String("123456");//如果不是数字会被抛出异常，程序终止
//		double  d = Double.parseDouble(str);//字符串转double
//		System.out.println(1+d);
//	}
	
}
