package a39.l20.interfaces;
/**
 * Интерфейс MusicPlayer представляет абстракцию для музыкального плеера. Описывает основные действия для воспроизведения музыки.
 */
public interface MusicPlayer {
  void playMusic(String track);
  void stopMusic();
}