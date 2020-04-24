public class exercise {
	public static void main (String[] args) {
	try{
			float[] a=new float[5];
			float sum=0;
			for(int i=0;i<a.length;i++){
				a[i]=Float.parseFloat(args[i]);
				System.out.println ("第"+(i+1)+"门课程的成绩是:"+a[i]);
				sum=sum+a[i];
			}
			System.out.println("总成绩是："+sum);
			float avg=sum/a.length;
			System.out.println ("平均成绩是:"+avg);
		} catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("数组下标越界异常");
		}catch(NumberFormatException ex){
			System.out.println("数字格式异常");
		}catch(ArithmeticException ex){
			System.out.println("算术异常");
		}catch(Exception ex){
			System.out.println("其他异常");
		}
		}
}

