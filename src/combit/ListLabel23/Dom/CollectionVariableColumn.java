package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class CollectionVariableColumn extends DomItem {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setNamePostfix (java.lang.String value){ try { javonetHandle.set("NamePostfix",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getNamePostfix (){ try { return  (java.lang.String) javonetHandle.get("NamePostfix");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetProperty
	 */
            public void setResult (java.lang.String value){ try { javonetHandle.set("Result",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getResult (){ try { return  (java.lang.String) javonetHandle.get("Result");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CollectionVariableColumn (CollectionCollectionVariableColumns collectionCollectionVarColumns){  super((NObject) null); try {  javonetHandle = Javonet.New("CollectionVariableColumn",collectionCollectionVarColumns); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CollectionVariableColumn (CollectionCollectionVariableColumns collectionCollectionVarColumns,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("CollectionVariableColumn",collectionCollectionVarColumns,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CollectionVariableColumn(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}