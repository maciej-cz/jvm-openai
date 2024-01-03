package io.github.stefanbratanov.chatjpt;

import java.util.List;

public record ChatResponse(
    String id,
    long created,
    String model,
    String systemFingerprint,
    List<Choice> choices,
    Usage usage) {

  public record Choice(int index, Message message, Logprobs logprobs, String finishReason) {}

  public record Usage(int promptTokens, int completionTokens, int totalTokens) {}
}
