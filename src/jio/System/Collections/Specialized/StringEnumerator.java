package jio.System.Collections.Specialized;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import jio.System.Collections.Specialized.*;public class StringEnumerator {protected NObject javonetHandle; /**
	 * GetProperty
	 */
            public java.lang.String getCurrent (){ try { return  (java.lang.String) javonetHandle.get("Current");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public StringEnumerator(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.Boolean MoveNext (){ try { return javonetHandle.invoke("MoveNext");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return false;} }/**
	 * Method
	 */
            public void Reset (){ try { javonetHandle.invoke("Reset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}