public class exercise {
	public static void main (String[] args) {
	try{
			float[] a=new float[5];
			float sum=0;
			for(int i=0;i<a.length;i++){
				a[i]=Float.parseFloat(args[i]);
				System.out.println ("��"+(i+1)+"�ſγ̵ĳɼ���:"+a[i]);
				sum=sum+a[i];
			}
			System.out.println("�ܳɼ��ǣ�"+sum);
			float avg=sum/a.length;
			System.out.println ("ƽ���ɼ���:"+avg);
		} catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("�����±�Խ���쳣");
		}catch(NumberFormatException ex){
			System.out.println("���ָ�ʽ�쳣");
		}catch(ArithmeticException ex){
			System.out.println("�����쳣");
		}catch(Exception ex){
			System.out.println("�����쳣");
		}
		}
}

