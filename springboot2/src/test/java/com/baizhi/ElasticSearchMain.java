package com.baizhi;

import com.alibaba.druid.util.StringUtils;
import org.elasticsearch.index.analysis.Analysis;
import org.elasticsearch.index.analysis.PreBuiltAnalyzerProvider;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Optional;

public class ElasticSearchMain {
    public static void main(String[] args) {
     /*   LocalDate now = LocalDate.now();
        System.out.println(now);
        Optional<Object> empty = Optional.empty();
        Optional<Object> o = Optional.of(null);
        System.out.println(o);
        System.out.println(empty);*/
      /*  Optional<Object> o = Optional.ofNullable("value");
        System.out.println(o.orElseGet(()->"defaultValue"));;*/
        System.out.println("请输入目标值");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int i = scanner.nextInt();
        int[] nvm = {2, 7, 9, 11};
        for (int i1 = 0; i1 < nvm.length - 1; i1++) {
            for (int j = i1 + 1; j < nvm.length; j++) {
                if (nvm[i1] + nvm[j] == i) {
                    System.out.println( i1+" "+j);
                }
            }

        }
    }
    @Test
    public void test1(){
        int n=1;
int j=n>0?2:4;
        System.out.println(n);
    }
    @Test
    public void test2(){

}
    }

