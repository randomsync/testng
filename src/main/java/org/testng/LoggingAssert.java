package org.testng;

import com.google.inject.internal.Lists;

import java.util.List;

public class LoggingAssert extends FlexibleAssert {

  private List<String> m_messages = Lists.newArrayList();

  @Override
  public void onBeforeAssert(IAssert a) {
    m_messages.add("Test:" + a.getMessage());
  }

  public List<String> getMessages() {
    return m_messages;
  }
}
