package combit.ListLabel23.Dom;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import combit.ListLabel23.Dom.*;public class PropertyBackgroundShapesItem extends PropertyShapeItemBase {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setOffset (java.lang.String value){ try { javonetHandle.set("Offset",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getOffset (){ try { return  (java.lang.String) javonetHandle.get("Offset");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public PropertyBackgroundShapesItem (DomItem item){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyBackgroundShapesItem",item); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyBackgroundShapesItem (CollectionBackgroundShapesItems collectionBackgroundShapesItems){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyBackgroundShapesItem",collectionBackgroundShapesItems); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyBackgroundShapesItem (CollectionBackgroundShapesItems collectionBackgroundShapesItems,java.lang.Integer index){  super((NObject) null); try {  javonetHandle = Javonet.New("PropertyBackgroundShapesItem",collectionBackgroundShapesItems,index); super.setJavonetHandle(javonetHandle); } catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public PropertyBackgroundShapesItem(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}