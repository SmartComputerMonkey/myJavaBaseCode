package file;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratorDirDemo {
	public static void main(String[] args) {
        IteratorDir(new File("/"));

    }
	public static void IteratorDir(File file){
	       
    	if (file!=null) {
            
            if (file.isFile()||file.listFiles().length==0) {
                return;
            }else {
                File[] files=file.listFiles();
                String path = file.getPath();
                System.out.println("+++++++++==== "+path);
               
                files =sort(files);
                List<Map<String,Object>> files2 = new ArrayList<Map<String,Object>>();
                for (File f : files) {
                	Map<String,Object> map = new HashMap<String,Object>();
                   
//                    StringBuilder sb = new StringBuilder();
                   /* if(f.isFile()){
                        sb.append(getTab(level));
                        sb.append(f.getName());
                    }else{
                        sb.append(getTab(level));
                        sb.append(f.getName());
                        sb.append("\\");
                    }*/
                	map.put("treeid", file.getPath());
                    map.put("uid", f.getPath());
                    files2.add(map);
//                    System.out.println(sb.toString());
                    
//                    if (f.isDirectory()) {
//                        level++;           
////                        IteratorDir(f);    
//                        level--;          
//                    }
                }
                System.out.println("=========================================");
                for (Map<String, Object> map : files2) {
                	
					System.out.println("++++++==treeid======= " + map.get("treeid"));
					System.out.println("++++++==uid  ======= " + map.get("uid"));
				}
            }
        }

    }
	 private static File[] sort(File[] files){
	        List<File> fList = new ArrayList<>();
	        //�ȴ���ļ��У�Ŀ¼��
	        for (File f : files) {
	            if (f.isDirectory()) {
	                fList.add(f);
	            }
	        }
	        //�ڴ���ļ�
	        for (File f : files) {
	            if (f.isFile()) {
	                fList.add(f);
	            }
	        }
	        //�Ѽ��ϵ��е�Ԫ��ת����Ϊָ����С��ָ�����͵�����
	        return fList.toArray(new File[fList.size()]);
	    }
}

