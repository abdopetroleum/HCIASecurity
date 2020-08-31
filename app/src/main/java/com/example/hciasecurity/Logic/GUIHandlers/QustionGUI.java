package com.example.hciasecurity.Logic.GUIHandlers;

public interface QustionGUI<T> {
    public void drawGUI();
    public T getUserAnswer();
    public boolean isAnswered();
    public void drawCorrectAnswer();
    public void drawCorrectAnserFull();
  //  public void drawCorrectAnswer();
}
