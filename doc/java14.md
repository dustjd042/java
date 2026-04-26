### NullPointException 문구 개선
* 개선전 [(java11)](../java11/src/test/java/com/yeonseong/java/ExceptionTest.java)
    ```text
    java.lang.NullPointerException
        at com.yeonseong.java11.ExceptionTest.nullPointException(ExceptionTest.java:11)
    ```
* 개선후 [(java17)](../java17/src/test/java/com/yeonseong/java/ExceptionTest.java)
    ```text
    Cannot invoke "java.lang.Integer.intValue()" because "a" is null
    java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "a" is null
    ```