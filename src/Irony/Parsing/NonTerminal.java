package Irony.Parsing;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Irony.Parsing.*;
import jio.System.*;
import Irony.Ast.*;public class NonTerminal extends BnfTerm {protected NObject javonetHandle; /**
	 * GetFiled
	 */
            public BnfExpression getRule (){ try { return new BnfExpression((NObject)javonetHandle.<NObject>get("Rule"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setRule (BnfExpression param){ try { javonetHandle.set("Rule",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public BnfExpression getErrorRule (){ try { return new BnfExpression((NObject)javonetHandle.<NObject>get("ErrorRule"));} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return null;} }/**
	 * SetFiled
	 */
            public void setErrorRule (BnfExpression param){ try { javonetHandle.set("ErrorRule",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetFiled
	 */
            public java.lang.String getNodeCaptionTemplate (){ try { return  (java.lang.String) javonetHandle.get("NodeCaptionTemplate");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * SetFiled
	 */
            public void setNodeCaptionTemplate (java.lang.String param){ try { javonetHandle.set("NodeCaptionTemplate",param);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NonTerminal (java.lang.String name){  super((NObject) null); try {  javonetHandle = Javonet.New("NonTerminal",name); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Reduced", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ReducedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NonTerminal (java.lang.String name,java.lang.String errorAlias){  super((NObject) null); try {  javonetHandle = Javonet.New("NonTerminal",name,errorAlias); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Reduced", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ReducedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NonTerminal (java.lang.String name,java.lang.String errorAlias,Class nodeType){  super((NObject) null); try {  javonetHandle = Javonet.New("NonTerminal",name,errorAlias,Javonet.getType(getReturnObjectName(nodeType).getTypeName())); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Reduced", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ReducedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NonTerminal (java.lang.String name,java.lang.String errorAlias,AstNodeCreator nodeCreator){  super((NObject) null); try {  javonetHandle = Javonet.New("NonTerminal",name,errorAlias,nodeCreator); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Reduced", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ReducedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NonTerminal (java.lang.String name,Class nodeType){  super((NObject) null); try {  javonetHandle = Javonet.New("NonTerminal",name,Javonet.getType(getReturnObjectName(nodeType).getTypeName())); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Reduced", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ReducedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NonTerminal (java.lang.String name,AstNodeCreator nodeCreator){  super((NObject) null); try {  javonetHandle = Javonet.New("NonTerminal",name,nodeCreator); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Reduced", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ReducedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NonTerminal (java.lang.String name,BnfExpression expression){  super((NObject) null); try {  javonetHandle = Javonet.New("NonTerminal",name,expression); super.setJavonetHandle(javonetHandle); javonetHandle.addEventListener("Reduced", new com.javonet.api.INEventListener() {
                    @Override
                    public void eventOccurred(Object[] objects)
                    {
                        for (EventHandler<ReducedEventArgs> handler : _ReducedListeners) {handler.Invoke(Convert(objects[0], NObject.class),Convert(objects[1], ReducedEventArgs.class));}}});} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public NonTerminal(NObject handle) {super(handle);this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }/**
	 * Method
	 */
            public java.lang.String ToString (){ try { return  (java.lang.String) javonetHandle.invoke("ToString");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Method
	 */
            public void Init (GrammarData grammarData){ try { javonetHandle.invoke("Init",grammarData);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public void AddHintToAll (GrammarHint hint){ try { javonetHandle.invoke("AddHintToAll",hint);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * Method
	 */
            public java.lang.String GetNodeCaption (ParseTreeNode node){ try { return  (java.lang.String) javonetHandle.invoke("GetNodeCaption",node);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }/**
	 * Event
	 */
            private java.util.ArrayList< EventHandler<ReducedEventArgs>> _ReducedListeners = new java.util.ArrayList<EventHandler<ReducedEventArgs>>();

            public void addReduced(EventHandler<ReducedEventArgs> toAdd)
            {
                _ReducedListeners.add(toAdd);
            }
            public void removeReduced(EventHandler<ReducedEventArgs> toRemove)
            {
                _ReducedListeners.remove(toRemove);
            }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}