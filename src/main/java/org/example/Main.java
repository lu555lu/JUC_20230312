package org.example;
import lombok.extern.slf4j.Slf4j;
import org.openjdk.jol.info.ClassLayout;


@Slf4j
public class Main {
    public static void main(String[] args)  {
        Integer a=0xaaaa;
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }
}