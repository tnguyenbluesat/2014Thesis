stk.v.10.0
WrittenBy    STK_v10.0.2

BEGIN Chain

Name  Chain3
BEGIN Definition

   Type        Chain
   Operator    Or
   Order       1
   Recompute   Yes
   IntervalType    0
   ComputeIntervalStart    0.000000
   ComputeIntervalStop     7300800.000000
    ComputeIntervalPtr
	BEGIN	EVENTINTERVAL
			BEGIN Interval
				Start	3 Dec 2013 01:00:00.000000000
				Stop	25 Feb 2014 13:00:00.000000000
			END Interval
			IntervalState	Explicit
	END	EVENTINTERVAL

   UseSaveIntervalFile    No
   UseMinAngle     No
   UseMaxAngle     No
   UseMinLinkTime     No
   LTDelayCriterion    2.000000
   TimeConvergence     0.005000
   AbsValueConvergence 1.000000e-014
   RelValueConvergence 1.000000e-008
   MaxTimeStep         360.000000
   MinTimeStep         1.000000e-002
   UseLightTimeDelay   Yes
    DetectEventsUsingSamplesOnly No
    Object  Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6
    Object  Satellite/750km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/750km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/750km_p1_1/Receiver/adsb_satrcvr2 To Satellite/750km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1085.7979335305392
    Stop     1972.5509981060216
    Start    7327.7033283382607
    Stop     8008.5876142198204
    Start    13538.093549212363
    Stop     13970.83258280786
    Start    19785.596919278465
    Stop     19952.848910613677
    Start    66507.980298498951
    Stop     67050.871713374596
    Start    72400.149855780881
    Stop     73301.2157393292
    Start    78596.129178937481
    Stop     79379.029626416042
    Start    84865.263941816054
    Stop     85341.779270534185
    Start    91118.299411024782
    Stop     91289.106586957496
    Start    187342.73465650689
    Stop     187417.52187785649
    Start    193716.75299417987
    Stop     193851.07953583112
    Start    258690.78697177899
    Stop     258823.75956288207
    Start    264922.18835839635
    Stop     265312.5418273657
    Start    271132.414144226
    Stop     271743.85965376755
    Start    277416.98113214341
    Stop     277960.86133606127
    Start    336200.53993238206
    Stop     336757.56342622294
    Start    342472.55928101373
    Stop     343207.56701923779
    Start    348714.9806117554
    Stop     349629.15030916611
    Start    354925.4708358795
    Stop     355706.67851223634
    Start    361171.71801895392
    Stop     361638.05983786541
    Start    413880.71733276412
    Stop     414635.24759777723
    Start    419983.07669606031
    Stop     420898.6961334229
END StrandAccesses

   UseLoadIntervalFile    No

END Definition

BEGIN Extensions
    
    BEGIN Graphics

BEGIN Attributes

StaticColor					#ff00ff
AnimationColor					#ffff00
AnimationLineWidth					2.000000
StaticLineWidth					3.000000

END Attributes

BEGIN Graphics
    ShowGfx                Off
    ShowStatic             Off
    ShowAnimationHighlight On
    ShowAnimationLine      On
    ShowLinkDirection      Off
END Graphics
    END Graphics
    
    BEGIN ADFFileData
    END ADFFileData
    
    BEGIN Desc
    END Desc
    
    BEGIN Crdn
    END Crdn
    
    BEGIN VO
    END VO

END Extensions

END Chain

