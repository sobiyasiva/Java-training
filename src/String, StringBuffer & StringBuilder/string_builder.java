public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);  
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb); 
        sb.replace(6, 16, "Amazing");
        System.out.println("After replace: " + sb); 
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);  
        sb.reverse();
        System.out.println("After reverse: " + sb);  
        String result = sb.toString();
        System.out.println("Converted to String: " + result);  
    }
}
