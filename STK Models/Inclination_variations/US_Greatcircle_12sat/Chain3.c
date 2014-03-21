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
    Object  Satellite/700km_p1_1/Receiver/adsb_satrcvr2
    Object  Satellite/700km_p1_1/Transmitter/Cubesat_ADSB_5W5
    Object  Facility/Heathrow/Receiver/ADSB_GndRcvr11
   SaveMode    1
BEGIN StrandAccesses

  Strand    Aircraft/B747LAX_Heathrow/Transmitter/adsb_out6 To Satellite/700km_p1_1/Receiver/adsb_satrcvr2 To Satellite/700km_p1_1/Transmitter/Cubesat_ADSB_5W5 To Facility/Heathrow/Receiver/ADSB_GndRcvr11
    Start    1088.7547489220844
    Stop     1936.0199469082233
    Start    7262.0687080771404
    Stop     7911.358029828074
    Start    13404.862766118129
    Stop     13811.484487087007
    Start    19585.401738668221
    Stop     19729.441624216935
    Start    65971.199657377831
    Stop     66201.32074850917
    Start    71638.337242487731
    Stop     72489.045257619626
    Start    77750.675916095774
    Stop     78528.519295589242
    Start    83947.678620149061
    Stop     84436.994032656454
    Start    90137.967361074596
    Stop     90321.137760293728
    Start    191523.16123012337
    Stop     191667.69200325018
    Start    262050.28875946475
    Stop     262301.52977200493
    Start    268195.84755517758
    Stop     268673.82866631751
    Start    274358.34486945497
    Stop     274978.64192646637
    Start    338725.42191812489
    Stop     339340.72204476577
    Start    344922.61463163985
    Stop     345680.05855420383
    Start    351079.61414578301
    Stop     351964.10147977696
    Start    357224.79547374957
    Stop     357862.67694153986
    Start    363486.0332491459
    Stop     363743.41779330163
    Start    415426.35210412741
    Stop     416299.31177677604
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

