# TwipUtility
patrick-mc님이 만든 [twipe](https://github.com/patrick-mc/twipe)의 코드를 참고하여 만든 라이브러리입니다.

### 특징
 * 마인크래프트를 이용하지 않습니다.

## Installation
1. 이 레포지토리를 클론합니다.
```git clone https://github.com/playerdecuple/TwipUtility.git```
2. IntelliJ에서 엽니다. 끝!

## How to use?

### In Kotlin
ex) `Main.kt`
```kotlin
fun main(args: Array<String>) {
    TwipUtilityEventHandle.addListener(Listener)
    TwipUtilitySocketClient(STREAMER_NAME, TWIP_KEY)
}
```
ex) `Listener.kt`
```kotlin
class Listener: TwipUtilityEventListener {
    override fun onDonateReceived(streamer: String, amount: Int, comment: String, nickname: String) {
        println("$nickname 님이 $streamer 님에게 $amount 원 후원! \"$comment\"")
    }
}
```

### In Java
ex) `Main.java`
```java
public static void main(String[] args) {
    new TwipUtilitySocketClient(STREAMER_NAME, TWIP_KEY);
    TwipUtilityEventHandler.addListener(new TwipListener);
}
```
ex) `TwipListener.java`
```java
public class TwipListener implements TwipUtilityEventListener {
    @Override
    public void onDonateReceived(String streamer, int amount, String comment, String nickname) {
        System.out.println(nickname + " 님이 " + streamer+ " 님에게 " + amount + " 원 후원! \"" + comment + "\"");
    }
}
```

### 공통사항
`STREAMER_NAME`에 트위치 스트리머 아이디(playerdecuple 등)를 적습니다.  
`TWIP_KEY`에 트윕 Alert Box 코드(`https://twip.kr/widgets/alertbox/XXXXXXXXXX`에서 `XXXXXXXXXX`에 해당하는 부분)를 적습니다.

## 여담
코드가 너무 조악해도 뭐라고 하지 말아 주세요... 제가 개발을 많이 잘 하진 못합니다.
