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
    Start    1085.7979335305397
    Stop     1972.5509981060204
    Start    7327.7033283382607
    Stop     8008.5876142198103
    Start    13538.093549212357
    Stop     13970.832582807856
    Start    19785.596919278461
    Stop     19952.848910613666
    Start    66507.980298498922
    Stop     67050.871713374567
    Start    72400.149855780852
    Stop     73301.215739329156
    Start    78596.129178937452
    Stop     79379.029626416028
    Start    84865.263941816025
    Stop     85341.779270534113
    Start    91118.299411024738
    Stop     91289.106586957467
    Start    187342.7346565068
    Stop     187417.5218778564
    Start    193716.75299417981
    Stop     193851.07953583106
    Start    258690.78697177881
    Stop     258823.75956288195
    Start    264922.18835839618
    Stop     265312.54182736558
    Start    271132.41414422588
    Stop     271743.85965376755
    Start    277416.98113214329
    Stop     277960.86133606109
    Start    336200.53993238189
    Stop     336757.56342622289
    Start    342472.5592810135
    Stop     343207.56701923767
    Start    348714.98061175522
    Stop     349629.15030916606
    Start    354925.47083587945
    Stop     355706.67851223616
    Start    361171.7180189538
    Stop     361638.05983786529
    Start    413880.71733276395
    Stop     414635.24759777699
    Start    419983.07669606013
    Stop     420898.69613342267
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

