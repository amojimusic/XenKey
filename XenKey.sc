XenKey {

	classvar window, keyDownFunc, osc1View, osc1Menu, osc1AmpView, osc1Amp, osc1Freq, osc2View, osc2AmpView, osc2Menu, osc1Amp, osc2Amp, osc2Freq, atk, rel, amp, fmView, fmSlider, muteButton, muteIndex, fil1View, fil1Sel, fil1Cut, fil1Res, fil2View, fil2Sel, fil2Cut, fil2Res, selfFMView, selfFM, globalAmpView, globalAmp, lfo1View, lfo2View, lfo3View, lfo4View, lfo5View, lfo6View, mapView1, mapView2, mapView3, mapView4, mapView5, mapView6;

	*new {
		this.window;
	}

	*window {
		window = Window("XenKey", Rect(500, 100, 831.5, 500)).front.background_(Color(0.3, 0.27, 0.28)).alwaysOnTop_(true);

		keyDownFunc = {
			arg view, char, mod, unicode, keycode;

			if(char.asString == "z"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[0]]);
			};
			if(char.asString == "Z"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[0] * 2]);
			};
			if(char.asString == "x"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[1]]);
			};
			if(char.asString == "X"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[1] * 2]);
			};
			if(char.asString == "c"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[2]]);
			};
			if(char.asString == "C"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[2] * 2]);
			};
			if(char.asString == "v"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[3]]);
			};
			if(char.asString == "V"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[3] * 2]);
			};
			if(char.asString == "b"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[4]]);
			};
			if(char.asString == "B"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[4] * 2]);
			};
			if(char.asString == "n"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[5]]);
			};
			if(char.asString == "N"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[5] * 2]);
			};
			if(char.asString == "m"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[6]]);
			};
			if(char.asString == "M"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[6] * 2]);
			};
			if(char.asString == "a"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[7]]);
			};
			if(char.asString == "A"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[7] * 2]);
			};
			if(char.asString == "s"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[8]]);
			};
			if(char.asString == "S"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[8] * 2]);
			};
			if(char.asString == "d"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[9]]);
			};
			if(char.asString == "D"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[9] * 2]);
			};
			if(char.asString == "f"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[10]]);
			};
			if(char.asString == "F"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[10] * 2]);
			};
			if(char.asString == "g"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[11]]);
			};
			if(char.asString == "G"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[11] * 2]);
			};
			if(char.asString == "h"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[12]]);
			};
			if(char.asString == "H"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[12] * 2]);
			};
			if(char.asString == "j"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[13]]);
			};
			if(char.asString == "J"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[13] * 2]);
			};
			if(char.asString == "k"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[14]]);
			};
			if(char.asString == "K"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[14] * 2]);
			};
			if(char.asString == "l"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[15]]);
			};
			if(char.asString == "L"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[15] * 2]);
			};
			if(char.asString == "q"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[16]]);
			};
			if(char.asString == "Q"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[16] * 2]);
			};
			if(char.asString == "w"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[17]]);
			};
			if(char.asString == "W"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[17] * 2]);
			};
			if(char.asString == "e"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[18]]);
			};
			if(char.asString == "E"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[18] * 2]);
			};
			if(char.asString == "r"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[19]]);
			};
			if(char.asString == "R"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[19] * 2]);
			};
			if(char.asString == "t"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[20]]);
			};
			if(char.asString == "T"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[20] * 2]);
			};
			if(char.asString == "y"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[21]]);
			};
			if(char.asString == "Y"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[21] * 2]);
			};
			if(char.asString == "u"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[22]]);
			};
			if(char.asString == "U"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[22] * 2]);
			};
			if(char.asString == "i"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[23]]);
			};
			if(char.asString == "I"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[23] * 2]);
			};
			if(char.asString == "o"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[24]]);
			};
			if(char.asString == "O"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[24] * 2]);
			};
			if(char.asString == "p"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[25]]);
			};
			if(char.asString == "P"){
				Synth(XenKeySynth.synthName, [\freq, XenKeyTuning()[25] * 2]);
			};

			if(keycode == 37){
				XenKeySynth.octave_(0.25);
				XenKeySynth();
			};

			if(keycode == 40){
				XenKeySynth.octave_(0.5);
				XenKeySynth();
			};

			if(keycode == 17){
				XenKeySynth.octave_(1);
				XenKeySynth();
			};

			if(keycode == 38){
				XenKeySynth.octave_(2);
				XenKeySynth();
			};

			if(keycode == 39){
				XenKeySynth.octave_(4);
				XenKeySynth();
			};

		};

		osc1View = View(window, Rect(10, 5, 150, 150)).background_(Color(0.1, 0.2, 0.3));

		osc1Menu = PopUpMenu(osc1View, Rect(0, 0, 150, 40)).background_(Color.black).stringColor_(Color.white).items_(["Sine", "Triangle", "Saw", "Square"]).keyDownAction_(keyDownFunc).action_({
			|v|
			XenKeySynth.osc1Sel_(v.value);
			XenKeySynth();
		});

		TextField(osc1View, Rect(5, 42.5, 40, 20)).string_("Attack");

		atk = Slider(osc1View, Rect(5, 65, 15, 80)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.atk_(ControlSpec(0.001, 12.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(osc1View, Rect(55, 42.5, 50, 20)).string_("Release");

		rel = Slider(osc1View, Rect(55, 65, 15, 80)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.rel_(ControlSpec(0.001, 12.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(osc1View, Rect(105, 42.5, 40, 20)).string_("Amp");

		amp = Slider(osc1View, Rect(105, 65, 15, 80)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.amp_(ControlSpec(0.01, 1.1, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		osc1AmpView = View(window, Rect(160, 5, 36.5, 150)).background_(Color(0.1, 0.15, 0.2));

		TextField(osc1AmpView, Rect(2.5, 5, 30, 20)).string_("Amp");

		osc1Amp = Slider(osc1AmpView, Rect(5, 30, 15, 115)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1Amp_(ControlSpec(0.001, 1.1, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		osc2View = View(window, Rect(196.5, 5, 150, 150)).background_(Color(0.1, 0.2, 0.3));

		osc2Menu = PopUpMenu(osc2View, Rect(0, 0, 150, 40)).background_(Color.black).stringColor_(Color.white).items_(["Sine", "Triangle", "Saw", "Square"]).keyDownAction_(keyDownFunc).action_({
			|v|
			XenKeySynth.osc2Sel_(v.value);
			XenKeySynth();
		});

		TextField(osc2View, Rect(5, 42.5, 40, 20)).string_("Tuning");

		TextField(osc2View, Rect(5, 65, 40, 20)).string_("Osc 1");

		TextField(osc2View, Rect(45, 42.5, 30, 20)).string_("Mute");

		muteIndex = 0;

		muteButton = Button(osc2View, Rect(45, 65, 30, 20)).keyDownAction_(keyDownFunc).
		states_([["", Color.white, Color.white]]).action_({
			|v|
			muteIndex = muteIndex + 1;
			if(muteIndex % 2 == 0){
				muteButton.states_([["", Color.white, Color.white]]);
				XenKeySynth.muteSel_(0);
				XenKeySynth();
			}{
				muteButton.states_([["", Color.gray, Color.gray]]);
				XenKeySynth.muteSel_(1);
				XenKeySynth();
			};
			if(muteIndex == 2){
				muteIndex = 0;
			};




		});





		osc1Freq = Knob(osc2View, Rect(5, 90, 40, 40)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1R_(ControlSpec(0.125, 8.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(osc2View, Rect(80, 65, 40, 20)).string_("Osc 2");

		osc2Freq = Knob(osc2View, Rect(75, 90, 40, 40)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2R_(ControlSpec(0.125, 8.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		osc2AmpView = View(window, Rect(346.5, 5, 36.5, 150)).background_(Color(0.1, 0.15, 0.2));

		TextField(osc2AmpView, Rect(2.5, 5, 30, 20)).string_("Amp");

		osc2Amp = Slider(osc2AmpView, Rect(5, 30, 15, 115)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2Amp_(ControlSpec(0.001, 1.1, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		fmView = View(window, Rect(383, 5, 36.5, 150)).background_(Color(0.05, 0.075, 0.1));

		TextField(fmView, Rect(2.5, 5, 30, 20)).string_("FM");

		fmSlider = Slider(fmView, Rect(5, 30, 15, 115)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fmAmp_(ControlSpec(0.01, 10000.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.0);

		fil1View = View(window, Rect(419.5, 5, 150, 150)).background_(Color(0.1, 0.2, 0.3)).keyDownAction_(keyDownFunc);
		fil1Sel = PopUpMenu(fil1View, Rect(0, 0, 150, 40)).background_(Color.black).
		stringColor_(Color.white).
		items_(["Lowpass", "Bandpass", "Highpass"]).
		action_({
			|v|
			XenKeySynth.fil1Sel_(v.value);
			XenKeySynth();
		});

		TextField(fil1View, Rect(2.5, 45, 40, 20)).string_("Cutoff");

		fil1Cut = Slider(fil1View, Rect(2.5, 70, 145, 15)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1Cut_(ControlSpec(20.0, 20000, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(fil1View, Rect(45, 90, 60, 15)).string_("Resonance");

		fil1Res = Knob(fil1View, Rect(60, 110, 30, 30)).
		keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1Res_(ControlSpec(1.0, 0.01).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		fil2View = View(window, Rect(569.5, 5, 150, 150)).background_(Color(0.1, 0.2, 0.3)).keyDownAction_(keyDownFunc);
		fil2Sel = PopUpMenu(fil2View, Rect(0, 0, 150, 40)).background_(Color.black).
		stringColor_(Color.white).
		items_(["Lowpass", "Bandpass", "Highpass"]).
		action_({
			|v|
			XenKeySynth.fil2Sel_(v.value);
			XenKeySynth();
		});

		TextField(fil2View, Rect(2.5, 45, 40, 20)).string_("Cutoff");

		fil2Cut = Slider(fil2View, Rect(2.5, 70, 145, 15)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2Cut_(ControlSpec(20.0, 20000, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(fil2View, Rect(45, 90, 60, 15)).string_("Resonance");

		fil2Res = Knob(fil2View, Rect(60, 110, 30, 30)).
		keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2Res_(ControlSpec(1.0, 0.01).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		selfFMView = View(window, Rect(719.5, 5, 50, 150)).background_(Color(0.05, 0.075, 0.1)).keyDownAction_(keyDownFunc);
		TextField(selfFMView, Rect(5, 2.5, 42, 20)).string_("Self FM");

		selfFM = Slider(selfFMView, Rect(5, 22.5, 15, 120)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.selfFM_(ControlSpec(0.001, 5000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		globalAmpView = View(window, Rect(769.5, 5, 50, 150)).background_(Color(0.1, 0.15, 0.2)).keyDownAction_(keyDownFunc);
		TextField(globalAmpView, Rect(5, 2.5, 42, 20)).string_("Amp");

		globalAmp = Slider(globalAmpView, Rect(5, 22.5, 15, 120)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.globalAmp_(ControlSpec(0.001, 1.1).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);


		lfo1View = View(window, Rect(10, 155, 150, 150)).background_(Color(0.1, 0.2, 0.3));

		PopUpMenu(lfo1View, Rect(0, 0, 150, 40)).background_(Color.black).
		stringColor_(Color.white).
		items_(["Sine", "Triangle", "Saw", "Square", "Random"]).
		keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo1Sel_(v.value);
			XenKeySynth();
		});

		TextField(lfo1View, Rect(5, 42.6, 40, 20)).string_("Amp");

		Slider(lfo1View, Rect(5, 65, 15, 81)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo1Amp_(ControlSpec(0.001, 5.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(lfo1View, Rect(80, 42.6, 40, 20)).string_("Freq");

		Knob(lfo1View, Rect(80, 80, 50, 50)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo1Freq_(ControlSpec(0.001, 300.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);


		lfo2View = View(window, Rect(160, 155, 150, 150)).background_(Color(0.1, 0.2, 0.3));

		PopUpMenu(lfo2View, Rect(0, 0, 150, 40)).background_(Color.black).
		stringColor_(Color.white).
		items_(["Sine", "Triangle", "Saw", "Square", "Random"]).
		keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo2Sel_(v.value);
			XenKeySynth();
		});

		TextField(lfo2View, Rect(5, 42.6, 40, 20)).string_("Amp");

		Slider(lfo2View, Rect(5, 65, 15, 81)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo2Amp_(ControlSpec(0.001, 5.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(lfo2View, Rect(80, 42.6, 40, 20)).string_("Freq");

		Knob(lfo2View, Rect(80, 80, 50, 50)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo2Freq_(ControlSpec(0.001, 300.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		lfo3View = View(window, Rect(310, 155, 150, 150)).background_(Color(0.1, 0.2, 0.3));

		PopUpMenu(lfo3View, Rect(0, 0, 150, 40)).background_(Color.black).
		stringColor_(Color.white).
		items_(["Sine", "Triangle", "Saw", "Square", "Random"]).
		keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo3Sel_(v.value);
			XenKeySynth();
		});

		TextField(lfo3View, Rect(5, 42.6, 40, 20)).string_("Amp");

		Slider(lfo3View, Rect(5, 65, 15, 81)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo3Amp_(ControlSpec(0.001, 5.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(lfo3View, Rect(80, 42.6, 40, 20)).string_("Freq");

		Knob(lfo3View, Rect(80, 80, 50, 50)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo3Freq_(ControlSpec(0.001, 300.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		lfo4View = View(window, Rect(10, 305, 150, 150)).background_(Color(0.1, 0.2, 0.3));

		PopUpMenu(lfo4View, Rect(0, 0, 150, 40)).background_(Color.black).
		stringColor_(Color.white).
		items_(["Sine", "Triangle", "Saw", "Square", "Random"]).
		keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo4Sel_(v.value);
			XenKeySynth();
		});

		TextField(lfo4View, Rect(5, 42.6, 40, 20)).string_("Amp");

		Slider(lfo4View, Rect(5, 65, 15, 81)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo4Amp_(ControlSpec(0.001, 5.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(lfo4View, Rect(80, 42.6, 40, 20)).string_("Freq");

		Knob(lfo4View, Rect(80, 80, 50, 50)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo4Freq_(ControlSpec(0.001, 300.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		lfo5View = View(window, Rect(160, 305, 150, 150)).background_(Color(0.1, 0.2, 0.3));

		PopUpMenu(lfo5View, Rect(0, 0, 150, 40)).background_(Color.black).
		stringColor_(Color.white).
		items_(["Sine", "Triangle", "Saw", "Square", "Random"]).
		keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo5Sel_(v.value);
			XenKeySynth();
		});

		TextField(lfo5View, Rect(5, 42.6, 40, 20)).string_("Amp");

		Slider(lfo5View, Rect(5, 65, 15, 81)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo5Amp_(ControlSpec(0.001, 5.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(lfo5View, Rect(80, 42.6, 40, 20)).string_("Freq");

		Knob(lfo5View, Rect(80, 80, 50, 50)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo5Freq_(ControlSpec(0.001, 300.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);


		lfo6View = View(window, Rect(310, 305, 150, 150)).background_(Color(0.1, 0.2, 0.3));

		PopUpMenu(lfo6View, Rect(0, 0, 150, 40)).background_(Color.black).
		stringColor_(Color.white).
		items_(["Sine", "Triangle", "Saw", "Square", "Random"]).
		keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo6Sel_(v.value);
			XenKeySynth();
		});

		TextField(lfo6View, Rect(5, 42.6, 40, 20)).string_("Amp");

		Slider(lfo6View, Rect(5, 65, 15, 81)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo6Amp_(ControlSpec(0.001, 5.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		TextField(lfo6View, Rect(80, 42.6, 40, 20)).string_("Freq");

		Knob(lfo6View, Rect(80, 80, 50, 50)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.lfo6Freq_(ControlSpec(0.001, 300.0, \exponential).map(v.value));
			XenKeySynth();
		}).valueAction_(0.5);

		mapView1 = View(window, Rect(460, 155, 120, 150)).background_(Color.black);

		Slider(mapView1, Rect(0, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1FreqLfo1_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(12, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1AmpLfo1_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(24, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2FreqLfo1_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(36, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2AmpLfo1_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(48, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1CutLfo1_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(60, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1ResLfo1_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(72, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2CutLfo1_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(84, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2ResLfo1_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(96, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fmLfo1_(ControlSpec(0.001, 1000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView1, Rect(108, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.selfFMLfo1_(ControlSpec(0.001, 10000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		mapView2 = View(window, Rect(580, 155, 120, 150)).background_(Color.black);


		Slider(mapView2, Rect(0, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1FreqLfo2_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(12, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1AmpLfo2_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(24, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2FreqLfo2_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(36, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2AmpLfo2_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(48, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1CutLfo2_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(60, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1ResLfo2_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(72, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2CutLfo2_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(84, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2ResLfo2_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(96, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fmLfo2_(ControlSpec(0.001, 1000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView2, Rect(108, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.selfFMLfo2_(ControlSpec(0.001, 10000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);



		mapView3 = View(window, Rect(700, 155, 120, 150)).background_(Color.black);



		Slider(mapView3, Rect(0, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1FreqLfo3_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(12, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1AmpLfo3_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(24, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2FreqLfo3_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(36, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2AmpLfo3_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(48, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1CutLfo3_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(60, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1ResLfo3_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(72, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2CutLfo3_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(84, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2ResLfo3_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(96, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fmLfo3_(ControlSpec(0.001, 1000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView3, Rect(108, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.selfFMLfo3_(ControlSpec(0.001, 10000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);


		mapView4 = View(window, Rect(460, 305, 120, 150)).background_(Color.black);

		Slider(mapView4, Rect(0, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1FreqLfo4_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(12, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1AmpLfo4_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(24, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2FreqLfo4_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(36, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2AmpLfo4_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(48, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1CutLfo4_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(60, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1ResLfo4_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(72, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2CutLfo4_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(84, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2ResLfo4_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(96, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fmLfo4_(ControlSpec(0.001, 1000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView4, Rect(108, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.selfFMLfo4_(ControlSpec(0.001, 10000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		mapView5 = View(window, Rect(580, 305, 120, 150)).background_(Color.black);


		Slider(mapView5, Rect(0, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1FreqLfo5_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(12, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1AmpLfo5_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(24, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2FreqLfo5_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(36, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2AmpLfo5_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(48, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1CutLfo5_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(60, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1ResLfo5_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(72, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2CutLfo5_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(84, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2ResLfo5_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(96, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fmLfo5_(ControlSpec(0.001, 1000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView5, Rect(108, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.selfFMLfo5_(ControlSpec(0.001, 10000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);



		mapView6 = View(window, Rect(700, 305, 120, 150)).background_(Color.black);



		Slider(mapView6, Rect(0, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1FreqLfo6_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(12, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc1AmpLfo6_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(24, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2FreqLfo6_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(36, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.osc2AmpLfo6_(ControlSpec(0.001, 1.5).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(48, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1CutLfo6_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(60, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil1ResLfo6_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(72, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2CutLfo6_(ControlSpec(0.001, 3000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(84, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fil2ResLfo6_(ControlSpec(0.001, 1.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(96, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.fmLfo6_(ControlSpec(0.001, 1000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);

		Slider(mapView6, Rect(108, 0, 12, 150)).keyDownAction_(keyDownFunc).
		action_({
			|v|
			XenKeySynth.selfFMLfo6_(ControlSpec(0.001, 10000.0).map(v.value));
			XenKeySynth();
		}).valueAction_(0);









		window.view.keyDownAction_(keyDownFunc);
		XenKeySynth();

	}

}

XenKeyTuning {
	classvar <>tonic = 60;
	classvar <>di = 0.46153846153846;

	*new {
		^[tonic, tonic + di, tonic + (di * 2), tonic + (di * 3), tonic + (di * 4), tonic + (di * 5), tonic + (di * 6), tonic + (di * 7), tonic + (di * 8), tonic + (di * 9), tonic + (di * 10), tonic + (di * 11), tonic + (di * 12), tonic + (di * 13), tonic + (di * 14), tonic + (di * 15), tonic + (di * 16), tonic + (di * 17), tonic + (di * 18), tonic + (di * 19), tonic + (di * 20), tonic + (di * 21), tonic + (di * 22), tonic + (di * 23), tonic + (di * 24), tonic + (di * 25), tonic + (di * 26), tonic + (di * 27), tonic + (di * 28), tonic + (di * 29), tonic + (di * 30), tonic + (di * 31), tonic + (di * 32), tonic + (di * 33), tonic + (di * 34), tonic + (di * 35)].midicps;
	}
}

XenKeySynth {

	classvar <>synthName = \xenSynth, <>osc1R = 1.0, <>osc2R = 1.0, <>osc1Amp = 1.0, <>osc2Amp = 1.0, <>selfFM = 0.0, <>amp = 1.0, <>atk = 0.01, <>rel = 1.0, <>osc1Sel = 0, <>osc2Sel = 0, <>fil1Sel = 0, <>fil2Sel = 0, <>muteSel = 0, <>fmAmp = 0.0, <>fil1Sel = 0, <>fil2Sel = 0, <>fil1Cut = 1000, <>fil2Cut = 1000, <>fil1Res = 1.0, <>fil2Res = 1.0, <>globalAmp = 1.0, <>lfo1Freq = 0.001, <>lfo2Freq = 0.001, <>lfo3Freq = 0.001, <>lfo4Freq = 0.001, <>lfo5Freq = 0.001, <>lfo6Freq = 0.001, <>lfo1Amp = 1.0, <>lfo2Amp = 1.0, <>lfo3Amp = 1.0, <>lfo4Amp = 1.0, <>lfo5Amp = 1.0, <>lfo6Amp = 1.0, <>osc1FreqLfo1 = 0.0, <>osc1FreqLfo2 = 0.0, <>osc1FreqLfo3 = 0.0, <>osc1FreqLfo4 = 0.0, <>osc1FreqLfo5 = 0.0, <>osc1FreqLfo6 = 0.0, <>osc2FreqLfo1 = 0.0, <>osc2FreqLfo2 = 0.0, <>osc2FreqLfo3 = 0.0, <>osc2FreqLfo4 = 0.0, <>osc2FreqLfo5 = 0.0, <>osc2FreqLfo6 = 0.0, <>osc1AmpLfo1 = 0.0, <>osc1AmpLfo2 = 0.0, <>osc1AmpLfo3 = 0.0, <>osc1AmpLfo4 = 0.0, <>osc1AmpLfo5 = 0.0, <>osc1AmpLfo6 = 0.0, <>osc2AmpLfo1 = 0.0, <>osc2AmpLfo2 = 0.0, <>osc2AmpLfo3 = 0.0, <>osc2AmpLfo4 = 0.0, <>osc2AmpLfo5 = 0.0, <>osc2AmpLfo6 = 0.0, <>fil1CutLfo1 = 0.0, <>fil1CutLfo2 = 0.0, <>fil1CutLfo3 = 0.0, <>fil1CutLfo4 = 0.0, <>fil1CutLfo5 = 0.0, <>fil1CutLfo6 = 0.0, <>fil2CutLfo1 = 0.0, <>fil2CutLfo2 = 0.0, <>fil2CutLfo3 = 0.0, <>fil2CutLfo4 = 0.0, <>fil2CutLfo5 = 0.0, <>fil2CutLfo6 = 0.0, <>fil1ResLfo1 = 0.0, <>fil1ResLfo2 = 0.0, <>fil1ResLfo3 = 0.0, <>fil1ResLfo4 = 0.0, <>fil1ResLfo5 = 0.0, <>fil1ResLfo6 = 0.0, <>fil2ResLfo1 = 0.0, <>fil2ResLfo2 = 0.0, <>fil2ResLfo3 = 0.0, <>fil2ResLfo4 = 0.0, <>fil2ResLfo5 = 0.0, <>fil2ResLfo6 = 0.0, <>fmLfo1 = 0.0, <>fmLfo2 = 0.0, <>fmLfo3 = 0.0, <>fmLfo4 = 0.0, <>fmLfo5 = 0.0, <>fmLfo6 = 0.0, <>selfFMLfo1 = 0.0, <>selfFMLfo2 = 0.0, <>selfFMLfo3 = 0.0, <>selfFMLfo4 = 0.0, <>selfFMLfo5 = 0.0, <>selfFMLfo6 = 0.0, <>lfo1Sel = 0, <>lfo2Sel = 0, <>lfo3Sel = 0, <>lfo4Sel = 0, <>lfo5Sel = 0, <>lfo6Sel = 0, <>octave = 1, <>pan = 0.0;


	*new {
		SynthDef.new(XenKeySynth.synthName, {
			var lfo1, lfo2, lfo3, lfo4, lfo5, lfo6, env, osc1, osc2, self;
			env = EnvGen.kr(Env([0, amp, 0], [atk, rel], [1.0, -1.0]), doneAction: 2);


			lfo1 = Select.ar(lfo1Sel, [
				SinOsc.ar(lfo1Freq, 0, lfo1Amp),
				LFTri.ar(lfo1Freq, 0, lfo1Amp),
				Saw.ar(lfo1Freq, lfo1Amp),
				Pulse.ar(lfo1Freq, 0.5, lfo1Amp),
				LFNoise0.ar(lfo1Freq, lfo1Amp)
			]);

			lfo2 = Select.ar(lfo2Sel, [
				SinOsc.ar(lfo2Freq, 0, lfo2Amp),
				LFTri.ar(lfo2Freq, 0, lfo2Amp),
				Saw.ar(lfo2Freq, lfo2Amp),
				Pulse.ar(lfo2Freq, 0.5, lfo2Amp),
				LFNoise0.ar(lfo2Freq, lfo2Amp)
			]);

			lfo3 = Select.ar(lfo3Sel, [
				SinOsc.ar(lfo3Freq, 0, lfo3Amp),
				LFTri.ar(lfo3Freq, 0, lfo3Amp),
				Saw.ar(lfo3Freq, lfo3Amp),
				Pulse.ar(lfo3Freq, 0.5, lfo3Amp),
				LFNoise0.ar(lfo3Freq, lfo3Amp)
			]);

			lfo4 = Select.ar(lfo4Sel, [
				SinOsc.ar(lfo4Freq, 0, lfo4Amp),
				LFTri.ar(lfo4Freq, 0, lfo4Amp),
				Saw.ar(lfo4Freq, lfo4Amp),
				Pulse.ar(lfo4Freq, 0.5, lfo4Amp),
				LFNoise0.ar(lfo4Freq, lfo4Amp)
			]);

			lfo5 = Select.ar(lfo5Sel, [
				SinOsc.ar(lfo5Freq, 0, lfo5Amp),
				LFTri.ar(lfo5Freq, 0, lfo5Amp),
				Saw.ar(lfo5Freq, lfo5Amp),
				Pulse.ar(lfo5Freq, 0.5, lfo5Amp),
				LFNoise0.ar(lfo5Freq, lfo5Amp)
			]);

			lfo6 = Select.ar(lfo6Sel, [
				SinOsc.ar(lfo6Freq, 0, lfo6Amp),
				LFTri.ar(lfo6Freq, 0, lfo6Amp),
				Saw.ar(lfo6Freq, lfo6Amp),
				Pulse.ar(lfo6Freq, 0.5, lfo6Amp),
				LFNoise0.ar(lfo6Freq, lfo6Amp)
			]);

			self = LocalIn.ar * (Clip.kr(1 + (lfo1 * selfFMLfo1) + (lfo2 * selfFMLfo2) + (lfo3 * selfFMLfo3) + (lfo4 * selfFMLfo4) + (lfo5 * selfFMLfo5) + (lfo6 * selfFMLfo6), 0.001, 500.0));


			osc1 = Select.ar(osc1Sel, [
				SinOsc.ar(\freq.kr(440) * octave * osc1R + (self * selfFM) + (lfo1 * osc1FreqLfo1) + (lfo2 * osc1FreqLfo2) + (lfo3 * osc1FreqLfo3) + (lfo4 * osc1FreqLfo4) + (lfo5 * osc1FreqLfo5) + (lfo6 * osc1FreqLfo6), 0, 1 + (lfo1 * osc1AmpLfo1) + (lfo2 * osc1AmpLfo2) + (lfo3 * osc1AmpLfo3) + (lfo4 * osc1AmpLfo4) + (lfo5 * osc1AmpLfo5) + (lfo6 * osc1AmpLfo6)) ,
				LFTri.ar(\freq.kr * octave * osc1R + (self * selfFM) + (lfo1 * osc1FreqLfo1) + (lfo2 * osc1FreqLfo2) + (lfo3 * osc1FreqLfo3) + (lfo4 * osc1FreqLfo4) + (lfo5 * osc1FreqLfo5) + (lfo6 * osc1FreqLfo6), 0, 1 + (lfo1 * osc1AmpLfo1) + (lfo2 * osc1AmpLfo2) + (lfo3 * osc1AmpLfo3) + (lfo4 * osc1AmpLfo4) + (lfo5 * osc1AmpLfo5) + (lfo6 * osc1AmpLfo6)),
				Saw.ar(\freq.kr * octave * osc1R + (self * selfFM) + (lfo1 * osc1FreqLfo1) + (lfo2 * osc1FreqLfo2) + (lfo3 * osc1FreqLfo3) + (lfo4 * osc1FreqLfo4) + (lfo5 * osc1FreqLfo5) + (lfo6 * osc1FreqLfo6), 1 + (lfo1 * osc1AmpLfo1) + (lfo2 * osc1AmpLfo2) + (lfo3 * osc1AmpLfo3) + (lfo4 * osc1AmpLfo4) + (lfo5 * osc1AmpLfo5) + (lfo6 * osc1AmpLfo6)),
				Pulse.ar(\freq.kr * octave * osc1R + (self * selfFM) + (lfo1 * osc1FreqLfo1) + (lfo2 * osc1FreqLfo2) + (lfo3 * osc1FreqLfo3) + (lfo4 * osc1FreqLfo4) + (lfo5 * osc1FreqLfo5) + (lfo6 * osc1FreqLfo6), 0.5, 1 + (lfo1 * osc1AmpLfo1) + (lfo2 * osc1AmpLfo2) + (lfo3 * osc1AmpLfo3) + (lfo4 * osc1AmpLfo4) + (lfo5 * osc1AmpLfo5) + (lfo6 * osc1AmpLfo6))]) * osc1Amp * env;


			osc2 = Select.ar(osc2Sel, [
				SinOsc.ar(\freq.kr(440) * octave * osc2R + (self * selfFM) +
					(Clip.kr(osc1 * (fmAmp + (lfo1 * fmLfo1) + (lfo2 * fmLfo2) + (lfo3 * fmLfo3) + (lfo4 * fmLfo4) + (lfo5 * fmLfo5) + (lfo6 * fmLfo6)), 0.001, 15000.0)) +
					(lfo1 * osc2FreqLfo1) + (lfo2 * osc2FreqLfo2) + (lfo3 * osc2FreqLfo3) + (lfo4 * osc2FreqLfo4) + (lfo5 * osc2FreqLfo5) + (lfo6 * osc2FreqLfo6), 0, 1 + (lfo1 * osc2AmpLfo1) + (lfo2 * osc2AmpLfo2) + (lfo3 * osc2AmpLfo3) + (lfo4 * osc2AmpLfo4) + (lfo5 * osc2AmpLfo5) + (lfo6 * osc2AmpLfo6)),
				LFTri.ar(\freq.kr * octave * osc2R + (self * selfFM) +
					(Clip.kr(osc1 * (fmAmp + (lfo1 * fmLfo1) + (lfo2 * fmLfo2) + (lfo3 * fmLfo3) + (lfo4 * fmLfo4) + (lfo5 * fmLfo5) + (lfo6 * fmLfo6)), 0.001, 15000.0))
					+ (lfo1 * osc2FreqLfo1) + (lfo2 * osc2FreqLfo2) + (lfo3 * osc2FreqLfo3) + (lfo4 * osc2FreqLfo4) + (lfo5 * osc2FreqLfo5) + (lfo6 * osc2FreqLfo6), 0, 1 + (lfo1 * osc2AmpLfo1) + (lfo2 * osc2AmpLfo2) + (lfo3 * osc2AmpLfo3) + (lfo4 * osc2AmpLfo4) + (lfo5 * osc2AmpLfo5) + (lfo6 * osc2AmpLfo6)),
				Saw.ar(\freq.kr * octave * osc2R + (self * selfFM) +
					(Clip.kr(osc1 * (fmAmp + (lfo1 * fmLfo1) + (lfo2 * fmLfo2) + (lfo3 * fmLfo3) + (lfo4 * fmLfo4) + (lfo5 * fmLfo5) + (lfo6 * fmLfo6)), 0.001, 15000.0))
					+ (lfo1 * osc2FreqLfo1) + (lfo2 * osc2FreqLfo2) + (lfo3 * osc2FreqLfo3) + (lfo4 * osc2FreqLfo4) + (lfo5 * osc2FreqLfo5) + (lfo6 * osc2FreqLfo6), 1 + (lfo1 * osc2AmpLfo1) + (lfo2 * osc2AmpLfo2) + (lfo3 * osc2AmpLfo3) + (lfo4 * osc2AmpLfo4) + (lfo5 * osc2AmpLfo5) + (lfo6 * osc2AmpLfo6)),
				Pulse.ar(\freq.kr * octave * osc2R + (self * selfFM) +
					(Clip.kr(osc1 * (fmAmp + (lfo1 * fmLfo1) + (lfo2 * fmLfo2) + (lfo3 * fmLfo3) + (lfo4 * fmLfo4) + (lfo5 * fmLfo5) + (lfo6 * fmLfo6)), 0.001, 15000.0))
					+ (lfo1 * osc2FreqLfo1) + (lfo2 * osc2FreqLfo2) + (lfo3 * osc2FreqLfo3) + (lfo4 * osc2FreqLfo4) + (lfo5 * osc2FreqLfo5) + (lfo6 * osc2FreqLfo6), 0.5, 1 + (lfo1 * osc2AmpLfo1) + (lfo2 * osc2AmpLfo2) + (lfo3 * osc2AmpLfo3) + (lfo4 * osc2AmpLfo4) + (lfo5 * osc2AmpLfo5) + (lfo6 * osc2AmpLfo6))]) * osc2Amp * env;

			osc1 = Select.ar(muteSel, [osc1.blend(osc2, 0.5), osc2]);

			osc1 = Select.ar(fil1Sel, [
				RLPF.ar(osc1, Clip.kr(fil1Cut + (lfo1 * fil1CutLfo1) + (lfo2 * fil1CutLfo2) + (lfo3 * fil1CutLfo3) + (lfo4 * fil1CutLfo4) + (lfo5 * fil1CutLfo5) + (lfo6 * fil1CutLfo6), 20.0, 19000.0), Clip.kr(fil1Res + (lfo1 * fil1ResLfo1) + (lfo2 * fil1ResLfo2) + (lfo3 * fil1ResLfo3) + (lfo4 * fil1ResLfo4) + (lfo5 * fil1ResLfo5) + (lfo6 * fil1ResLfo6),
					0.01, 1.0)),
				BPF.ar(osc1, Clip.kr(fil1Cut + (lfo1 * fil1CutLfo1) + (lfo2 * fil1CutLfo2) + (lfo3 * fil1CutLfo3) + (lfo4 * fil1CutLfo4) + (lfo5 * fil1CutLfo5) + (lfo6 * fil1CutLfo6), 20.0, 19000.0), Clip.kr(fil1Res + (lfo1 * fil1ResLfo1) + (lfo2 * fil1ResLfo2) + (lfo3 * fil1ResLfo3) + (lfo4 * fil1ResLfo4) + (lfo5 * fil1ResLfo5) + (lfo6 * fil1ResLfo6),
					0.01, 1.0)
				),
				RHPF.ar(osc1, Clip.kr(fil1Cut + (lfo1 * fil1CutLfo1) + (lfo2 * fil1CutLfo2) + (lfo3 * fil1CutLfo3) + (lfo4 * fil1CutLfo4) + (lfo5 * fil1CutLfo5) + (lfo6 * fil1CutLfo6), 20.0, 19000.0), Clip.kr(fil1Res + (lfo1 * fil1ResLfo1) + (lfo2 * fil1ResLfo2) + (lfo3 * fil1ResLfo3) + (lfo4 * fil1ResLfo4) + (lfo5 * fil1ResLfo5) + (lfo6 * fil1ResLfo6),
					0.01, 1.0))]);


			osc1 = Select.ar(fil2Sel, [
				RLPF.ar(osc1, Clip.kr(fil2Cut + (lfo1 * fil2CutLfo1) + (lfo2 * fil2CutLfo2) + (lfo3 * fil2CutLfo3) + (lfo4 * fil2CutLfo4) + (lfo5 * fil2CutLfo5) + (lfo6 * fil2CutLfo6), 20.0, 19000.0), Clip.kr(fil2Res + (lfo1 * fil2ResLfo1) + (lfo2 * fil2ResLfo2) + (lfo3 * fil2ResLfo3) + (lfo4 * fil2ResLfo4) + (lfo5 * fil2ResLfo5) + (lfo6 * fil2ResLfo6),
					0.01, 1.0)),
				BPF.ar(osc1, Clip.kr(fil2Cut + (lfo1 * fil2CutLfo1) + (lfo2 * fil2CutLfo2) + (lfo3 * fil2CutLfo3) + (lfo4 * fil2CutLfo4) + (lfo5 * fil2CutLfo5) + (lfo6 * fil2CutLfo6), 20.0, 19000.0), Clip.kr(fil2Res + (lfo1 * fil2ResLfo1) + (lfo2 * fil2ResLfo2) + (lfo3 * fil2ResLfo3) + (lfo4 * fil2ResLfo4) + (lfo5 * fil2ResLfo5) + (lfo6 * fil2ResLfo6),
					0.01, 1.0)),
				RHPF.ar(osc1, Clip.kr(fil2Cut + (lfo1 * fil2CutLfo1) + (lfo2 * fil2CutLfo2) + (lfo3 * fil2CutLfo3) + (lfo4 * fil2CutLfo4) + (lfo5 * fil2CutLfo5) + (lfo6 * fil2CutLfo6), 20.0, 19000.0), Clip.kr(fil2Res + (lfo1 * fil2ResLfo1) + (lfo2 * fil2ResLfo2) + (lfo3 * fil2ResLfo3) + (lfo4 * fil2ResLfo4) + (lfo5 * fil2ResLfo5) + (lfo6 * fil2ResLfo6),
					0.01, 1.0))]);

			LocalOut.ar(osc1);

			osc1 = osc1 * globalAmp;

			osc1 = osc1 * 0.5;
			osc1 = Pan2.ar(osc1, pan);
			osc1 = Clip.ar(osc1, -0.9, 0.9);
			Out.ar(\out.kr(0), osc1);

		}).add;
	}



}