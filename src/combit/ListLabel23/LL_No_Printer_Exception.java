package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.*;public class LL_No_Printer_Exception extends ListLabelException {public NObject javonetHandle; public LL_No_Printer_Exception (){  super((NObject) null); try {  javonetHandle = Javonet.New("LL_No_Printer_Exception"); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LL_No_Printer_Exception (java.lang.String message){  super((NObject) null); try {  javonetHandle = Javonet.New("LL_No_Printer_Exception",message); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LL_No_Printer_Exception (java.lang.String message,jio.System.Exception innerException){  super((NObject) null); try {  javonetHandle = Javonet.New("LL_No_Printer_Exception",message,innerException); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public LL_No_Printer_Exception(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}