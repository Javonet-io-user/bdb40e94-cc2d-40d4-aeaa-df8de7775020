package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class CollectionVariable extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setNamePrefix (java.lang.String value){ try { javonetHandle.set("NamePrefix",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNamePrefix (){ try { return  (java.lang.String) javonetHandle.get("NamePrefix");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * GetProperty
	 */
            public CollectionCollectionVariableCollectionItems getItems (){ try { return new CollectionCollectionVariableCollectionItems((NObject)javonetHandle.<NObject>get("Items"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }public CollectionVariable (CollectionCollectionVariables collectionCollectionVariables){  super((NObject) null); try {  javonetHandle = Javonet.New("CollectionVariable",collectionCollectionVariables); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CollectionVariable (CollectionCollectionVariables collectionCollectionVariables,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("CollectionVariable",collectionCollectionVariables,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CollectionVariable(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}