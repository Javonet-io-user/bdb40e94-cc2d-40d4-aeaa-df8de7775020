package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class UserVariable extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setContents (java.lang.String value){ try { javonetHandle.set("Contents",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getContents (){ try { return  (java.lang.String) javonetHandle.get("Contents");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setName (java.lang.String value){ try { javonetHandle.set("Name",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getName (){ try { return  (java.lang.String) javonetHandle.get("Name");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public UserVariable (CollectionUserVariables userVariableCollection){  super((NObject) null); try {  javonetHandle = Javonet.New("UserVariable",userVariableCollection); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public UserVariable (CollectionUserVariables userVariableCollection,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("UserVariable",userVariableCollection,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public UserVariable(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}