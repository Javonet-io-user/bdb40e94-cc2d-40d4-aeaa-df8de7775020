package combit.ListLabel23;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.*;
import combit.ListLabel23.*;public class TriggeredJobInUIThreadEventArgs extends EventArgs {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.Integer getUserData (){ try { return javonetHandle.get("UserData");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return 0;} }public TriggeredJobInUIThreadEventArgs (java.lang.Integer userData){  super((NObject) null); try {  javonetHandle = Javonet.New("TriggeredJobInUIThreadEventArgs",userData); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public TriggeredJobInUIThreadEventArgs(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}