MPlayer - The Movie Player (http://www.mplayerhq.hu)

This is the Windows version of MPlayer the movie player.
Unlike the Linux version this port does not yet include a graphical
user interface but I'm sure you will soon notice how powerful
a command line player can be.

See the bottom of this file for a list of keyboard shortcuts to control MPlayer.
A complete list of command line parameters is in man_page.html.

You should also read the Windows section of the MPlayer documentation, it
contains to most common problems:

http://www.mplayerhq.hu/DOCS/HTML/en/windows.html

The complete MPlayer documentation is at

http://www.mplayerhq.hu/DOCS/HTML/en/index.html

If you are looking for translated versions, see

http://www.mplayerhq.hu/homepage/design7/info.html#docs

Note that the documentation is made for the Linux version of this
player. Nevertheless most things are valid for the Windows port.


The files in this package:
mplayer.exe   - the main executable
mencoder.exe  - a full featured video encoder
man_page.html - HTML document explaining the supported options
LICENSE       - a copy of the GNU General Public License (GNU GPL)
Copyrights    - copyrights of various other projects used in MPlayer
AUTHORS       - (incomplete) authors list
Readme.txt    - this document
codecs/       - MPlayer will look for binary codecs (Real, QuickTime etc.) here.
                MPlayer will also use codecs installed on the system.
                You can download some binary codecs from our downlad page:
                http://www.mplayerhq.hu/homepage/dload.html

mplayer/input.conf - keybinding configuration file
mplayer/config     - configuration file, you can adjust options there,
                     e.g. your font path (default: C:\Windows\fonts)
mplayer/drivers    - drivers for direct hardware access using VIDIX technology
                     Read the READMEs for installation instructions.


Features:
- static mplayer.exe compiled with runtime CPU detection
- binary codec support
- networking support
- support for OGM, Matroska, QuickTime and Real container formats
- DVD support
- fast decoding using FFmpeg's libavcodec
- AAC and Ogg decoding
- MEncoder supporting FFmpeg, XviD and lame for encoding
...
See the homepage for a complete list of features.


New in this preview is the support for VIDIX. VIDIX allows MPlayer to directly
use the graphics hardware. While this can give better performance it is also
very dangerous because two independent drivers are sharing the same hardware.
This may lead to system crashes, halts, bluescreens, hardware damage, data
coruption etc. The MPlayer team won't take any responsiblity for such problems.
To use the optional VIDIX drivers install the appropriate dhahelper from the
drivers directory and start MPlayer with '-vo winvidix'.



The latest version of the release can always be found at
http://www.mplayerhq.hu/MPlayer/releases/win32-beta/

A list of other binary packages and projects using MPlayer can be found at
http://www.mplayerhq.hu/homepage/design7/projects.html#windows

Mailing list for Windows related questions:
http://mplayerhq.hu/mailman/listinfo/mplayer-cygwin



21.01.2005 Sascha Sommer


KEYBOARD CONTROL

general control
  <- and ->
       Seek backward/forward 10 seconds.
  up and down
       Seek backward/forward 1 minute.
  pgup and pgdown
       Seek backward/forward 10 minutes.
  [ and ]
       Decreases/increases current playback speed by 10%.
  { and }
       Halves/doubles current playback speed.
  Backspace
       Reset playback speed to normal.
  < and >
       backward/forward in playlist
  HOME and END
       next/previous playtree entry in the parent list
  INS and DEL
       next/previous alternative source (ASX playlist only)
  p / SPACE
       Pause movie (pressing again unpauses).
  .
       Step forward.  Pressing once  will  pause  movie,  every
       consecutive  press  will play one frame and then go into
       pause mode again (any other key unpauses).
  q / ESC
       Stop playing and quit.
  + and -
       Adjust audio delay by +/- 0.1 seconds.
  / and *
       Decrease/increase volume.
  9 and 0
       Decrease/increase volume.
  m
       Mute sound.
  f
       Toggle fullscreen (also see -fs).
  T
       Toggle stay-on-top (also see -ontop).
  w and e
       Decrease/increase pan-and-scan range.
  o
       Toggle OSD states: none / seek / seek + timer /  seek  +
       timer + total time.
  d
       Toggle frame dropping states: none / skip display / skip
       decoding (see -framedrop and -hardframedrop).
  v
       Toggle subtitle visibility.
  b / j
       Cycle through the available subtitles.
  F
       Toggle displaying "forced subtitles".
  a
       Toggle subtitle aligment: top/middle/bottom.
  z and x
       Adjust subtitle delay by +/- 0.1 seconds.
  r and t
       Move subtitles up/down.
  i
       Set EDL mark.

(The following keys are valid only when using  a  hardware  accelerated
video  output  (xv,  (x)vidix,  (x)mga, etc), or the software equalizer
filter (-vf eq or -vf eq2).

  1 and 2
       Adjust contrast.
  3 and 4
       Adjust brightness.
  5 and 6
       Adjust hue.
  7 and 8
       Adjust saturation.
