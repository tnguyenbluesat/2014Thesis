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
    Object  Satellite/700km_90deg_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/700km_90deg_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/700km_90deg_p1_1/Receiver/adsb_satrcvr2 To Satellite/700km_90deg_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    60268.569688092903
    Stop     60597.784498842004
    Start    65763.657750333616
    Stop     66551.322051455019
    Start    71769.015516861851
    Stop     72438.141007250117
    Start    143152.86201247294
    Stop     143627.63198137435
    Start    149090.7337030546
    Stop     149627.91658519892
    Start    155066.08517724901
    Stop     155552.26613476127
    Start    160991.89567827911
    Stop     161362.02762127121
    Start    197525.91367530753
    Stop     198113.58080085067
    Start    203549.128159463
    Stop     203975.14221583906
    Start    274699.19427409634
    Stop     275226.14122127567
    Start    280598.23730801773
    Stop     281452.19520473713
    Start    286561.80612575746
    Stop     287246.6598111979
    Start    333054.17925765202
    Stop     333466.47067007254
    Start    357850.36497715593
    Stop     358020.81904266513
    Start    363685.99775055959
    Stop     363948.80884258728
    Start    369616.52644222596
    Stop     369772.89963127545
    Start    410193.58670616191
    Stop     410735.33124117646
    Start    415930.3829220857
    Stop     416629.21529943618
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

